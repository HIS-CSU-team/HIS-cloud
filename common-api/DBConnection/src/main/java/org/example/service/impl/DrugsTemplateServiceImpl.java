package org.example.service.impl;

import org.example.entity.DrugsTemplate;
import org.example.persistence.DrugsTemplateMapper;
import org.example.service.DrugsTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DrugsTemplateService")
public class DrugsTemplateServiceImpl implements DrugsTemplateService {
    @Autowired
    DrugsTemplateMapper drugsTemplateMapper;

    @Override
    public void addDrugsTemplate(DrugsTemplate drugsTemplate) {
        drugsTemplateMapper.insert(drugsTemplate);
    }

    @Override
    public void deleteDrugsTemplateById(int id) {
        drugsTemplateMapper.deleteById(id);
    }

    @Override
    public void updateDrugsTemplate(DrugsTemplate drugsTemplate) {
        drugsTemplateMapper.updateById(drugsTemplate);
    }

    @Override
    public DrugsTemplate getDrugsTemplateById(int id) {
        return drugsTemplateMapper.selectById(id);
    }
}
