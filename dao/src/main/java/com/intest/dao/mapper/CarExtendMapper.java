package com.intest.dao.mapper;

import com.intest.dao.entity.CarBtoExtend;

import java.util.List;

public interface CarExtendMapper {

    List<CarBtoExtend>  getCars(CarBtoExtend carEx);
}
