package org.example.service.impl;

import org.example.entity.Disease;
import org.example.persistence.DiseaseMapper;
import org.example.service.DiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DiseaseService")
public class DiseaseServiceImpl implements DiseaseService {
    @Autowired
    DiseaseMapper diseaseMapper;

    @Override
    public void addDisease(Disease disease) {
        diseaseMapper.insert(disease);
    }

    @Override
    public void deleteDiseaseById(int id) {
        diseaseMapper.deleteById(id);
    }

    @Override
    public void updateDisease(Disease disease) {
        diseaseMapper.updateById(disease);
    }

    @Override
    public Disease getDiseaseById(int id) {
        return diseaseMapper.selectById(id);
    }
}
