package com.intest.basicservice.table.service.impl;


import com.intest.basicservice.table.service.OptionService;
import com.intest.dao.entity.OptionBto;
import com.intest.dao.mapper.OptionBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OptionImpl implements OptionService {
    @Autowired
    OptionBtoMapper optionBtoMapper;

    @Override
    public OptionBto getOptionById(String optionId) {
        return optionBtoMapper.selectByPrimaryKey(optionId);
    }


    @Override
    public int addOption(OptionBto optionBto) {
        return optionBtoMapper.insertSelective(optionBto);
    }

    @Override
    public int updateOption(OptionBto optionBto) {
        return optionBtoMapper.updateByPrimaryKeySelective(optionBto);
    }

    @Override
    public int deleteOption(String optionId) {
        return optionBtoMapper.deleteByPrimaryKey(optionId);
    }
}
