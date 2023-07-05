package org.example.service;

import org.example.entity.PrescriptionDetailed;

public interface PrescriptionDetailedService {
    void addPrescriptionDetailed(PrescriptionDetailed prescriptionDetailed);
    void deletePrescriptionDetailedById(int id);
    void updatePrescriptionDetailed(PrescriptionDetailed prescriptionDetailed);
    PrescriptionDetailed getPrescriptionDetailedById(int id);
}