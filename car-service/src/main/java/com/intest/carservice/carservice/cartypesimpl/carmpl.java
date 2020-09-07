package com.intest.carservice.carservice.cartypesimpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.carservice.carservice.CarService;
import com.intest.carservice.carservice.Request.*;
import com.intest.carservice.carservice.Respone.*;
import com.intest.carservice.carservice.carTypeTool.carTools;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.*;
import com.intest.dao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@TableDataAnnotation
@Transactional
public class carmpl implements CarService {

    @Autowired
    CarBtoMapper carmp;

    @Autowired
    CarTypeBtoMapper cartypemp;

    @Autowired
    TaskCarBtoMapper taskcarmp;

    @Autowired
    TaskBtoMapper taskmp;

    @Autowired
    TerminalBtoMapper terminalmp;

    @Autowired
    PartsBtoMapper partmp;

    @Autowired
    PartsTypeBtoMapper partstypemp;

    @Autowired
    PartsPackageBtoMapper ppmp;

    /* 删除车型时用到：查询车型下是否有车辆
    根据车型ID获取车辆
     */
    @Override
    public List<CarBto> getCar(String carTypeId) {
        CarBtoExample carEx = new CarBtoExample();
        CarBtoExample.Criteria cia = carEx.createCriteria();
        cia.andFkCartypeIdEqualTo(carTypeId);
        List<CarBto> btos = carmp.selectByExample(carEx);
        return btos;
    }

    /*
    删除车辆
     */
    @Override
    public PagerDataBaseVO delCars(List<carsEx> carArr) {

        PagerDataBaseVO carVO = new PagerDataBaseVO();
        String errMsg = "";
        int delcount = 0;
        List<delCarRespone> carrsps = new ArrayList<>();
        delCarRespone carrsp = new delCarRespone();
        for (carsEx car : carArr) {
            int i = carmp.deleteByPrimaryKey(car.getCarid());
            if (i == 0) {
                errMsg += String.format("车辆VIN：%s  删除失败！\r\n", car.getVin());
            }
            else {
                delcount += i;
            }
        }

        //给返回的对象赋值
        carrsp.setSuccessCount(delcount);
        carrsp.setSuccessMsg(errMsg);
        carrsps.add(carrsp);

        //封装返回对象
        PageInfo pageInfo = new PageInfo<delCarRespone>(carrsps);
        carVO.setTotal(pageInfo.getTotal());
        carVO.setData(carrsps);

        return carVO;
    }

    /*
    获取车辆
     */
    @Override
    @TableDataAnnotation(tableId = "60bcb090-90e2-4508-835a-bf691cb3409f")
    public PagerDataBaseVO getCars(CarRequest carq) {
        int pageindex = carq.getPi();
        int pagesize = carq.getPs();
        //查询条件
        PageHelper.startPage(pageindex, pagesize);
        List<CarBto> cars = new ArrayList<>();
        try {
            CarBtoExample carExample = new CarBtoExample();
            String sort = carTools.replaceCharacter(carq.getSort());
            carExample.setOrderByClause(sort);
            cars = carmp.selectByExample(carExample);
        } catch (Exception carEx) {

        }
        //返回对象
        PagerDataBaseVO carsVO = new PagerDataBaseVO();
        List<CarRespone> carRespones = new ArrayList<>();

        //序号index赋值
        int index = 0;
        int rownumstar = 0;
        int rownumend = (pageindex) * pagesize;
        if (pageindex > 1) {
            rownumstar = (pageindex - 1) * pagesize;
        }
        index = rownumstar;
        //时间格式
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //循环赋值返回对象
        for (CarBto car : cars) {
            index += 1;
            if (index <= rownumstar) {
                continue;
            }
            if (index > rownumend) {
                break;
            }
            CarRespone crp = new CarRespone();
            //获取车型名称
            CarTypeBto carTypeBto = cartypemp.selectByPrimaryKey(car.getFkCartypeId());
            //根据车型的终端外键ID获取终端型号
            TerminalBto terminalBto = terminalmp.selectByPrimaryKey(carTypeBto.getFkTerminalId());
            //给车辆赋值基本信息
            crp.setCarId(car.getCarId());
            crp.setCarTypeName(carTypeBto.getCartypename());
            crp.setAddType(car.getAddtype().toString());
            crp.setIndex(index);
            crp.setTerminal(terminalBto.getTerminalname());
            crp.setVin(car.getVin());
            crp.setCreateAt(ft.format(car.getCreateat()));

            //获取车辆任务
            TaskCarBtoExample tcEx = new TaskCarBtoExample();
            TaskCarBtoExample.Criteria cia = tcEx.createCriteria();
            cia.andVinEqualTo(car.getVin());
            List<TaskCarBto> tcbtos = taskcarmp.selectByExample(tcEx);
            TaskCarBto tcbto = new TaskCarBto();

            //获取任务名称
            TaskBto tbto = new TaskBto();
            CarTask cartask = new CarTask();
            if (tcbtos.size() > 0) {
                tcbto = tcbtos.get(0);
                tbto = taskmp.selectByPrimaryKey(tcbto.getFkTaskId());
                cartask.setTaskName(tbto.getTaskname());
                cartask.setExTask(1);
                //车辆任务执行状态
                cartask.setExecuteStatus(tcbto.getFkTaskcarstatusvalueCode());
                //车辆任务审批状态
                cartask.setCheckStatus(tbto.getFkTaskstatusvalueCode());
            }

            //赋值一辆车的数据
            crp.setTaskMsg(cartask);
            //把车辆添加到车辆集合里面，然后一起返回
            carRespones.add(crp);
        }

        PageInfo pageInfo = new PageInfo<CarRespone>(carRespones);
        carsVO.setTotal(pageInfo.getTotal());
        carsVO.setData(carRespones);
        return carsVO;
    }


    /*
    查看车辆详情
     */
    @Override
    public PagerDataBaseVO getCarInfo(String carId) {
        CarBto car = new CarBto();
        try {
            car = carmp.selectByPrimaryKey(carId);
        } catch (Exception carEx) {
            return new PagerDataBaseVO();
        }
        List<CarRespone> carRespones = new ArrayList<>();
        //时间格式
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CarRespone crp = new CarRespone();

        //获取车型名称
        CarTypeBto carTypeBto = cartypemp.selectByPrimaryKey(car.getFkCartypeId());
        //根据车型的终端外键ID获取终端型号
        TerminalBto terminalBto = terminalmp.selectByPrimaryKey(carTypeBto.getFkTerminalId());
        //给车辆赋值基本信息
        crp.setCarId(car.getCarId());
        crp.setCarTypeName(carTypeBto.getCartypename());
        crp.setAddType(car.getAddtype().toString());
        crp.setTerminal(terminalBto.getTerminalname());
        crp.setVin(car.getVin());
        crp.setCreateAt(ft.format(car.getCreateat()));
        crp.setCreateBy(car.getCreateby());
        crp.setTerminalCode(car.getTerminalcode());
        crp.setICCID(car.getIccid());
        crp.setOperator("电信");
        //终端制造厂商，需要添加字段
        //crp.setpCompany(car.getpCompany());

        //获取车辆任务
        TaskCarBtoExample tcEx = new TaskCarBtoExample();
        TaskCarBtoExample.Criteria cia = tcEx.createCriteria();
        cia.andVinEqualTo(car.getVin());
        List<TaskCarBto> tcbtos = taskcarmp.selectByExample(tcEx);
        TaskCarBto tcbto = new TaskCarBto();

        //获取任务名称
        TaskBto tbto = new TaskBto();
        CarTask cartask = new CarTask();
        if (tcbtos.size() > 0) {
            tcbto = tcbtos.get(0);
            tbto = taskmp.selectByPrimaryKey(tcbto.getFkTaskId());
            cartask.setTaskName(tbto.getTaskname());
            cartask.setExTask(1);
        }

        //获取该车辆绑定的零件
        PartsBtoExample partEx = new PartsBtoExample();
        PartsBtoExample.Criteria ciapart = partEx.createCriteria();
        ciapart.andFkCartypeIdEqualTo(car.getFkCartypeId());

        //查找车辆的零件
        List<PartsBto> parts = partmp.selectByExample(partEx);
        List<CarEcu> ecus = new ArrayList<>();
        int ecuCount = 0;
        //获取零件信息集合
        for (PartsBto pt : parts) {
            CarEcu te = new CarEcu();
            te.setIndex(ecuCount += 1);
            te.setEcuName(pt.getPartsname());
            te.setPartCode(pt.getPartscode());
            //获取零件的零件类型
            PartsTypeBto ptbto = partstypemp.selectByPrimaryKey(pt.getFkPartstypeId());
            //零件类型名
            te.setPartType(ptbto.getPartstypename());
            //获取零件版本
            PartsPackageBtoExample ppEX = new PartsPackageBtoExample();
            PartsPackageBtoExample.Criteria ciapp = ppEX.createCriteria();
            ciapp.andFkPartsIdEqualTo(pt.getPartsId());
            List<PartsPackageBto> ppbtos = ppmp.selectByExample(ppEX);
            if (ppbtos.size() > 0) {
                PartsPackageBto ppbto = ppbtos.get(0);
                te.setPartVersion(ppbto.getSoftwareversion());
                te.setUpdateAt(ft.format(ppbto.getUpdateat()));
            }
            ecus.add(te);
        }

        crp.setEcus(ecus);
        carRespones.add(crp);
        //返回对象
        PagerDataBaseVO carVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<CarRespone>(carRespones);
        carVO.setTotal(pageInfo.getTotal());
        carVO.setData(carRespones);
        return carVO;
    }


    /*
    添加车辆
     */
    @Override
    public int addCar(addCar pcar) {
        PagerDataBaseVO addcarVO = new PagerDataBaseVO();

        CarBto cb = new CarBto();
        cb.setCarId(UUID.randomUUID().toString());
        cb.setAddtype((short) 1);
        cb.setVin(pcar.getVin());
        cb.setFkCartypeId(pcar.getCarTypeId());
        cb.setTerminalcode(pcar.getTerminalCode());
        //终端厂商没字段
        // cb.
        cb.setIccid(pcar.getIccid());
        //运营商也没有
        //cb.get

        //添加新车辆
        int carcount = carmp.insert(cb);

        return carcount;
    }

    /*
    修改车辆
     */
    @Override
    public int mdfCar(addCar pcar) {
        CarBto cb = new CarBto();
        cb.setCarId(pcar.getCarId());
        cb.setAddtype((short) 1);
        cb.setVin(pcar.getVin());
        cb.setFkCartypeId(pcar.getCarTypeId());
        cb.setTerminalcode(pcar.getTerminalCode());
        //终端厂商没字段
        // cb.
        cb.setIccid(pcar.getIccid());
        //运营商也没有
        //cb.get

        //修改车辆
        int carcount = carmp.updateByPrimaryKey(cb);

        return carcount;
    }

    /*
    新增车辆，获取的车型
     */
    @Override
    public PagerDataBaseVO getCarTypes() {
        CarTypeBtoExample carTypeExample = new CarTypeBtoExample();
        List<CarTypeBto> cartypes = cartypemp.selectByExample(carTypeExample);

        List<CarTypeRespone> cartyperps = new ArrayList<>();
        for (CarTypeBto ctbto : cartypes) {
            CarTypeRespone cartyperp = new CarTypeRespone();

            cartyperp.setCartypeId(ctbto.getCartypeId());
            cartyperp.setCartypeName(ctbto.getCartypename());
            //根据车型的终端外键ID获取终端型号
            TerminalBto terminalBto = terminalmp.selectByPrimaryKey(ctbto.getFkTerminalId());
            if (terminalBto != null) {
                cartyperp.setTerminal(terminalBto.getTerminalname());
            }
            cartyperps.add(cartyperp);
        }

        PagerDataBaseVO cartypeVO = new PagerDataBaseVO();
        PageInfo pageInfo = new PageInfo<CarTypeRespone>(cartyperps);
        cartypeVO.setData(cartyperps);
        cartypeVO.setTotal(pageInfo.getTotal());

        return cartypeVO;
    }
}