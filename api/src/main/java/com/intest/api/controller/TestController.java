package com.intest.api.controller;

import com.intest.service.CarService;
import com.intest.dao.entity.Car;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhanghui
 * @create 2020-08-05 22:31
 */
@RestController
@Api(tags = "测试")
public class TestController {

    @Autowired
    private CarService carService;

    @GetMapping("/api/test")
    @ApiOperation(value = "获取车辆")
    public List<Car> test() {
        return carService.getCarInfo();
    }

}
