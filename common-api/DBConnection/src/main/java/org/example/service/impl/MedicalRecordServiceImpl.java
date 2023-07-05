package org.example.service.impl;

import org.example.entity.MedicalRecord;
import org.example.persistence.MedicalRecordMapper;
import org.example.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MedicalRecordService")
public class MedicalRecordServiceImpl implements MedicalRecordService {
    @Autowired
    MedicalRecordMapper medicalRecordMapper;

    @Override
    public void addMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordMapper.insert(medicalRecord);
    }

    @Override
    public void deleteMedicalRecordById(int id) {
        medicalRecordMapper.deleteById(id);
    }

    @Override
    public void updateMedicalRecord(MedicalRecord medicalRecord) {
        medicalRecordMapper.updateById(medicalRecord);
    }

    @Override
    public MedicalRecord getMedicalRecordById(int id) {
        return medicalRecordMapper.selectById(id);
    }
}
