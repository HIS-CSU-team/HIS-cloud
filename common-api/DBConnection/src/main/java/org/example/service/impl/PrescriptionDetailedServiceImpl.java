package org.example.service.impl;

import org.example.entity.PrescriptionDetailed;
import org.example.persistence.PrescriptionDetailedMapper;
import org.example.service.PrescriptionDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PrescriptionDetailedService")
public class PrescriptionDetailedServiceImpl implements PrescriptionDetailedService {
    @Autowired
    PrescriptionDetailedMapper prescriptionDetailedMapper;

    @Override
    public void addPrescriptionDetailed(PrescriptionDetailed prescriptionDetailed) {
        prescriptionDetailedMapper.insert(prescriptionDetailed);
    }

    @Override
    public void deletePrescriptionDetailedById(int id) {
        prescriptionDetailedMapper.deleteById(id);
    }

    @Override
    public void updatePrescriptionDetailed(PrescriptionDetailed prescriptionDetailed) {
        prescriptionDetailedMapper.updateById(prescriptionDetailed);
    }

    @Override
    public PrescriptionDetailed getPrescriptionDetailedById(int id) {
        return prescriptionDetailedMapper.selectById(id);
    }
}
