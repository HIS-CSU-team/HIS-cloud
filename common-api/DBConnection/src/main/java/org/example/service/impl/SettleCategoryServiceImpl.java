package org.example.service.impl;

import org.example.entity.SettleCategory;
import org.example.persistence.SettleCategoryMapper;
import org.example.service.SettleCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SettleCategoryService")
public class SettleCategoryServiceImpl implements SettleCategoryService {
    @Autowired
    SettleCategoryMapper settleCategoryMapper;

    @Override
    public void addSettleCategory(SettleCategory settleCategory) {
        settleCategoryMapper.insert(settleCategory);
    }

    @Override
    public void deleteSettleCategoryById(int id) {
        settleCategoryMapper.deleteById(id);
    }

    @Override
    public void updateSettleCategory(SettleCategory settleCategory) {
        settleCategoryMapper.updateById(settleCategory);
    }

    @Override
    public SettleCategory getSettleCategoryById(int id) {
        return settleCategoryMapper.selectById(id);
    }
}
