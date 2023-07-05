package org.example.service.impl;

import org.example.entity.CheckRelation;
import org.example.persistence.CheckRelationMapper;
import org.example.service.CheckRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CheckRelationService")
public class CheckRelationServiceImpl implements CheckRelationService {
    @Autowired
    CheckRelationMapper checkRelationMapper;

    @Override
    public void addCheckRelation(CheckRelation checkRelation) {
        checkRelationMapper.insert(checkRelation);
    }

    @Override
    public void deleteCheckRelationById(int id) {
        checkRelationMapper.deleteById(id);
    }

    @Override
    public void updateCheckRelation(CheckRelation checkRelation) {
        checkRelationMapper.updateById(checkRelation);
    }

    @Override
    public CheckRelation getCheckRelationById(int id) {
        return checkRelationMapper.selectById(id);
    }
}
