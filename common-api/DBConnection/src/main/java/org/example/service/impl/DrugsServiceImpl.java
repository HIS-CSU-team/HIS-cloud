package org.example.service.impl;

import org.example.entity.Drugs;
import org.example.persistence.DrugsMapper;
import org.example.service.DrugsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DrugsService")
public class DrugsServiceImpl implements DrugsService {
    @Autowired
    DrugsMapper drugsMapper;

    @Override
    public void addDrug(Drugs drugs) {
        drugsMapper.insert(drugs);
    }

    @Override
    public void deleteDrugById(int id) {
        drugsMapper.deleteById(id);
    }

    @Override
    public void updateDrug(Drugs drugs) {
        drugsMapper.updateById(drugs);
    }

    @Override
    public Drugs getDrugById(int id) {
        return drugsMapper.selectById(id);
    }
}
