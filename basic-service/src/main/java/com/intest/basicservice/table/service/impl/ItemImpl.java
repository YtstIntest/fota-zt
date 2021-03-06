package com.intest.basicservice.table.service.impl;


import com.intest.basicservice.table.service.ItemService;
import com.intest.dao.entity.ItemBto;
import com.intest.dao.entity.ItemBtoExample;
import com.intest.dao.mapper.ItemBtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItemImpl implements ItemService {

    @Autowired
    ItemBtoMapper itemBtoMapper;

    @Override
    public List<ItemBto> getAllItem() {
        ItemBtoExample example = new ItemBtoExample();
        return itemBtoMapper.selectByExample(example);
    }

    @Override
    public ItemBto getItemById(String itemId) {
        return itemBtoMapper.selectByPrimaryKey(itemId);
    }

    @Override
    public int addItem(ItemBto itemBto) {
        return itemBtoMapper.insertSelective(itemBto);
    }

    @Override
    public int updateItem(ItemBto itemBto) {
        return itemBtoMapper.updateByPrimaryKeySelective(itemBto);
    }

    @Override
    public int deleteItem(String itemId) {
        return itemBtoMapper.deleteByPrimaryKey(itemId);
    }
}
