package org.example.service.impl;

import org.example.entity.HerbalPrescription;
import org.example.persistence.HerbalPrescriptionMapper;
import org.example.service.HerbalPrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("HerbalPrescriptionService")
public class HerbalPrescriptionServiceImpl implements HerbalPrescriptionService {
    @Autowired
    HerbalPrescriptionMapper herbalPrescriptionMapper;

    @Override
    public void addHerbalPrescription(HerbalPrescription herbalPrescription) {
        herbalPrescriptionMapper.insert(herbalPrescription);
    }

    @Override
    public void deleteHerbalPrescriptionById(int id) {
        herbalPrescriptionMapper.deleteById(id);
    }

    @Override
    public void updateHerbalPrescription(HerbalPrescription herbalPrescription) {
        herbalPrescriptionMapper.updateById(herbalPrescription);
    }

    @Override
    public HerbalPrescription getHerbalPrescriptionById(int id) {
        return herbalPrescriptionMapper.selectById(id);
    }
}
