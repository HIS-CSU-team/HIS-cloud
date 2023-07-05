package org.example.service.impl;

import org.example.entity.MedicalDisease;
import org.example.persistence.MedicalDiseaseMapper;
import org.example.service.MedicalDiseaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MedicalDiseaseService")
public class MedicalDiseaseServiceImpl implements MedicalDiseaseService {
    @Autowired
    MedicalDiseaseMapper medicalDiseaseMapper;

    @Override
    public void addMedicalDisease(MedicalDisease medicalDisease) {
        medicalDiseaseMapper.insert(medicalDisease);
    }

    @Override
    public void deleteMedicalDiseaseById(int id) {
        medicalDiseaseMapper.deleteById(id);
    }

    @Override
    public void updateMedicalDisease(MedicalDisease medicalDisease) {
        medicalDiseaseMapper.updateById(medicalDisease);
    }

    @Override
    public MedicalDisease getMedicalDiseaseById(int id) {
        return medicalDiseaseMapper.selectById(id);
    }
}
