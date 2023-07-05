package org.example.service.impl;

import org.example.entity.Prescription;
import org.example.persistence.PrescriptionMapper;
import org.example.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PrescriptionService")
public class PrescriptionServiceImpl implements PrescriptionService {
    @Autowired
    PrescriptionMapper prescriptionMapper;

    @Override
    public void addPrescription(Prescription prescription) {
        prescriptionMapper.insert(prescription);
    }

    @Override
    public void deletePrescriptionById(int id) {
        prescriptionMapper.deleteById(id);
    }

    @Override
    public void updatePrescription(Prescription prescription) {
        prescriptionMapper.updateById(prescription);
    }

    @Override
    public Prescription getPrescriptionById(int id) {
        return prescriptionMapper.selectById(id);
    }
}
