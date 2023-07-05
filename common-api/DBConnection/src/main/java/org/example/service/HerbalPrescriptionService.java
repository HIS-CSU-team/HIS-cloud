package org.example.service;

import org.example.entity.HerbalPrescription;

public interface HerbalPrescriptionService {
    void addHerbalPrescription(HerbalPrescription herbalPrescription);
    void deleteHerbalPrescriptionById(int id);
    void updateHerbalPrescription(HerbalPrescription herbalPrescription);
    HerbalPrescription getHerbalPrescriptionById(int id);
}