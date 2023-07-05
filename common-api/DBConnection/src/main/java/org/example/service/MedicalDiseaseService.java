package org.example.service;

import org.example.entity.MedicalDisease;

public interface MedicalDiseaseService {
    void addMedicalDisease(MedicalDisease medicalDisease);
    void deleteMedicalDiseaseById(int id);
    void updateMedicalDisease(MedicalDisease medicalDisease);
    MedicalDisease getMedicalDiseaseById(int id);
}