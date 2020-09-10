package com.intest.systemservice.impl.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.intest.common.exception.CustomException;
import com.intest.common.result.PagerDataBaseVO;
import com.intest.common.tableData.TableDataAnnotation;
import com.intest.dao.entity.TaskReviewTmpBto;
import com.intest.dao.entity.TaskReviewTmpBtoExample;
import com.intest.dao.entity.TaskReviewTmpDetileBto;
import com.intest.dao.entity.TaskReviewTmpDetileBtoExample;
import com.intest.dao.mapper.TaskReviewTmpBtoMapper;
import com.intest.dao.mapper.TaskReviewTmpDetileBtoMapper;
import com.intest.systemservice.impl.service.TaskReviewTmpPage;
import com.intest.systemservice.impl.service.TaskReviewTmpService;
import com.intest.systemservice.request.TaskReviewTmpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@TableDataAnnotation
public class TaskReviewTmpImpl implements TaskReviewTmpService {
    @Autowired
    TaskReviewTmpBtoMapper mapper;

    @Autowired
    TaskReviewTmpDetileBtoMapper detileBtoMapper;

    @Override
    public TaskReviewTmpBto getTaskReviewTmpById(String taskreviewtmpId) {
        return mapper.selectByPrimaryKey(taskreviewtmpId);
    }

    @Override
    public List<TaskReviewTmpBto> getTaskReviewTmpByTmpType(int tmpType) {
        TaskReviewTmpBtoExample example = new TaskReviewTmpBtoExample();
        TaskReviewTmpBtoExample.Criteria criteria = example.createCriteria();
        criteria.andTmpTypeEqualTo((short) tmpType);
        criteria.andStateEqualTo((short) 1);
        List<TaskReviewTmpBto> tmpBtoList = mapper.selectByExample(example);
        return tmpBtoList;
    }

    @Override
    public int addTaskReviewTmp(TaskReviewTmpBto taskReviewTmpBto) {
        if (taskReviewTmpBto.getState() == 1) {
            TaskReviewTmpBtoExample example = new TaskReviewTmpBtoExample();
            TaskReviewTmpBtoExample.Criteria criteria = example.createCriteria();
            criteria.andTmpTypeEqualTo(taskReviewTmpBto.getTmpType());
            criteria.andStateEqualTo((short) 1);
            List<TaskReviewTmpBto> tmpBtoList = mapper.selectByExample(example);
            if (tmpBtoList != null && tmpBtoList.size() > 0) {
                for (TaskReviewTmpBto bto : tmpBtoList) {
                    bto.setState((short) 0);
                    if (mapper.updateByPrimaryKey(bto) != 1) {
                        throw new CustomException("修改bto失败！");
                    }
                }
            }
        }
        return mapper.insert(taskReviewTmpBto);
    }

    @Override
    public int updateTaskReviewTmp(TaskReviewTmpBto taskReviewTmpBto) {
        if (taskReviewTmpBto.getState() == 1) {
            TaskReviewTmpBtoExample example = new TaskReviewTmpBtoExample();
            TaskReviewTmpBtoExample.Criteria criteria = example.createCriteria();
            criteria.andTmpTypeEqualTo(taskReviewTmpBto.getTmpType());
            criteria.andStateEqualTo((short) 1);
            List<TaskReviewTmpBto> tmpBtoList = mapper.selectByExample(example);
            if (tmpBtoList != null && tmpBtoList.size() > 0) {
                for (TaskReviewTmpBto bto : tmpBtoList) {
                    bto.setState((short) 0);
                    if (mapper.updateByPrimaryKey(bto) != 1) {
                        throw new CustomException("修改bto失败！");
                    }
                }
            }
        }
        return mapper.updateByPrimaryKey(taskReviewTmpBto);
    }

    @Override
    public int deleteTaskReviewTmp(String taskreviewtmpId) {
        return mapper.deleteByPrimaryKey(taskreviewtmpId);
    }

    @Override
    @TableDataAnnotation(tableId = "49ffe733-9cc6-4cda-ad35-b06b631d2b74")
    public PagerDataBaseVO getTaskReviewTmpInfo(TaskReviewTmpPage model) {
        PagerDataBaseVO task = new PagerDataBaseVO();
        PageHelper.startPage(model.getPi(), model.getPs());
        List<TaskReviewTmpBto> taskReviewTmpBtoList = mapper.selectByExample(null);
        List<TaskReviewTmpResponse> taskReviewTmpResponses = new ArrayList<>();
        PageInfo<TaskReviewTmpBto> pageInfo = new PageInfo<TaskReviewTmpBto>(taskReviewTmpBtoList);
        int index = pageInfo.getStartRow() - 1;
        for (TaskReviewTmpBto taskReviewTmpBto : taskReviewTmpBtoList) {
            TaskReviewTmpDetileBtoExample example = new TaskReviewTmpDetileBtoExample();
            TaskReviewTmpDetileBtoExample.Criteria criteria = example.createCriteria();
            criteria.andFkTaskreviewtmpIdEqualTo(taskReviewTmpBto.getTaskreviewtmpId());
            List<TaskReviewTmpDetileBto> detileBtos = detileBtoMapper.selectByExample(example);
            List<TaskReviewTmpResponse.DetailBean> detailBeans = new ArrayList<>();
            for (TaskReviewTmpDetileBto bto : detileBtos) {
                TaskReviewTmpResponse.DetailBean detailBean = new TaskReviewTmpResponse.DetailBean();
                detailBean.setIds(bto.getTaskreviewtmpdetaileId());
                detailBean.setLevel(bto.getReviewLevel());
                detailBeans.add(detailBean);
            }
            TaskReviewTmpResponse response = new TaskReviewTmpResponse();
            response.setIndex(index += 1);
            response.setTaskreviewtmpId(taskReviewTmpBto.getTaskreviewtmpId());
            response.setTaskReviewtmpName(taskReviewTmpBto.getTaskReviewtmpName());
            response.setTmpType(taskReviewTmpBto.getTmpType());
            response.setState(taskReviewTmpBto.getState());
            response.setTasknum(taskReviewTmpBto.getTasknum());
            response.setDetaileIDs(detailBeans);
            response.setCreateby(taskReviewTmpBto.getCreateby());
            response.setCreateat(taskReviewTmpBto.getCreateat());
            response.setUpdateat(taskReviewTmpBto.getUpdateat());
            response.setUpdateby(taskReviewTmpBto.getUpdateby());
            taskReviewTmpResponses.add(response);
        }
        task.setTotal(pageInfo.getTotal());
        task.setData(taskReviewTmpResponses);
        return task;
    }
}