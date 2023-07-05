package org.example.service.impl;

import org.example.entity.CheckApply;
import org.example.persistence.CheckApplyMapper;
import org.example.service.CheckApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CheckApplyService")
public class CheckApplyServiceImpl implements CheckApplyService {
    @Autowired
    CheckApplyMapper checkApplyMapper;

    @Override
    public void addCheckApply(CheckApply checkApply) {
        checkApplyMapper.insert(checkApply);
    }

    @Override
    public void deleteCheckApplyById(int id) {
        checkApplyMapper.deleteById(id);
    }

    @Override
    public void updateCheckApply(CheckApply checkApply) {
        checkApplyMapper.updateById(checkApply);
    }

    @Override
    public CheckApply getCheckApplyById(int id) {
        return checkApplyMapper.selectById(id);
    }
}

