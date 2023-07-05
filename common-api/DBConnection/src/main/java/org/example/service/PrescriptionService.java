package org.example.service;

import org.example.entity.Prescription;

public interface PrescriptionService {
    void addPrescription(Prescription prescription);
    void deletePrescriptionById(int id);
    void updatePrescription(Prescription prescription);
    Prescription getPrescriptionById(int id);
}