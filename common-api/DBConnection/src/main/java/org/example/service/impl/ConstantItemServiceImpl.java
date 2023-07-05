package org.example.service.impl;

import org.example.entity.ConstantItem;
import org.example.persistence.ConstantItemMapper;
import org.example.service.ConstantItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ConstantItemService")
public class ConstantItemServiceImpl implements ConstantItemService {
    @Autowired
    ConstantItemMapper constantItemMapper;

    @Override
    public void addConstantItem(ConstantItem constantItem) {
        constantItemMapper.insert(constantItem);
    }

    @Override
    public void deleteConstantItemById(int id) {
        constantItemMapper.deleteById(id);
    }

    @Override
    public void updateConstantItem(ConstantItem constantItem) {
        constantItemMapper.updateById(constantItem);
    }

    @Override
    public ConstantItem getConstantItemById(int id) {
        return constantItemMapper.selectById(id);
    }
}
