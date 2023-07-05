package org.example.service;

import org.example.entity.PatientCosts;

public interface PatientCostsService {
    void addPatientCosts(PatientCosts patientCosts);
    void deletePatientCostsById(int id);
    void updatePatientCosts(PatientCosts patientCosts);
    PatientCosts getPatientCostsById(int id);
}