package org.example.service.impl;

import org.example.entity.HerbalTemplate;
import org.example.persistence.HerbalTemplateMapper;
import org.example.service.HerbalTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("HerbalTemplateService")
public class HerbalTemplateServiceImpl implements HerbalTemplateService {
    @Autowired
    HerbalTemplateMapper herbalTemplateMapper;

    @Override
    public void addHerbalTemplate(HerbalTemplate herbalTemplate) {
        herbalTemplateMapper.insert(herbalTemplate);
    }

    @Override
    public void deleteHerbalTemplateById(int id) {
        herbalTemplateMapper.deleteById(id);
    }

    @Override
    public void updateHerbalTemplate(HerbalTemplate herbalTemplate) {
        herbalTemplateMapper.updateById(herbalTemplate);
    }

    @Override
    public HerbalTemplate getHerbalTemplateById(int id) {
        return herbalTemplateMapper.selectById(id);
    }
}
