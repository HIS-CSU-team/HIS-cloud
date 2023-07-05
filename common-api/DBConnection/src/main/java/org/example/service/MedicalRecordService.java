package org.example.service;

import org.example.entity.MedicalRecord;

public interface MedicalRecordService {
    void addMedicalRecord(MedicalRecord medicalRecord);
    void deleteMedicalRecordById(int id);
    void updateMedicalRecord(MedicalRecord medicalRecord);
    MedicalRecord getMedicalRecordById(int id);
}