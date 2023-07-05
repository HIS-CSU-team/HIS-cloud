package org.example.service.impl;

import org.example.entity.CheckTemplate;
import org.example.persistence.CheckTemplateMapper;
import org.example.service.CheckTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CheckTemplateService")
public class CheckTemplateServiceImpl implements CheckTemplateService {
    @Autowired
    CheckTemplateMapper checkTemplateMapper;

    @Override
    public void addCheckTemplate(CheckTemplate checkTemplate) {
        checkTemplateMapper.insert(checkTemplate);
    }

    @Override
    public void deleteCheckTemplateById(int id) {
        checkTemplateMapper.deleteById(id);
    }

    @Override
    public void updateCheckTemplate(CheckTemplate checkTemplate) {
        checkTemplateMapper.updateById(checkTemplate);
    }

    @Override
    public CheckTemplate getCheckTemplateById(int id) {
        return checkTemplateMapper.selectById(id);
    }
}
