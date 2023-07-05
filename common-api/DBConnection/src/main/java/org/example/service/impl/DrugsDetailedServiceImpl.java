package org.example.service.impl;

import org.example.entity.DrugsDetailed;
import org.example.persistence.DrugsDetailedMapper;
import org.example.service.DrugsDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DrugsDetailedService")
public class DrugsDetailedServiceImpl implements DrugsDetailedService {
    @Autowired
    DrugsDetailedMapper drugsDetailedMapper;

    @Override
    public void addDrugsDetailed(DrugsDetailed drugsDetailed) {
        drugsDetailedMapper.insert(drugsDetailed);
    }

    @Override
    public void deleteDrugsDetailedById(int id) {
        drugsDetailedMapper.deleteById(id);
    }

    @Override
    public void updateDrugsDetailed(DrugsDetailed drugsDetailed) {
        drugsDetailedMapper.updateById(drugsDetailed);
    }

    @Override
    public DrugsDetailed getDrugsDetailedById(int id) {
        return drugsDetailedMapper.selectById(id);
    }
}
