package org.example.service.impl;

import org.example.entity.PatientCosts;
import org.example.persistence.PatientCostsMapper;
import org.example.service.PatientCostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PatientCostsService")
public class PatientCostsServiceImpl implements PatientCostsService {
    @Autowired
    PatientCostsMapper patientCostsMapper;

    @Override
    public void addPatientCosts(PatientCosts patientCosts) {
        patientCostsMapper.insert(patientCosts);
    }

    @Override
    public void deletePatientCostsById(int id) {
        patientCostsMapper.deleteById(id);
    }

    @Override
    public void updatePatientCosts(PatientCosts patientCosts) {
        patientCostsMapper.updateById(patientCosts);
    }

    @Override
    public PatientCosts getPatientCostsById(int id) {
        return patientCostsMapper.selectById(id);
    }
}
