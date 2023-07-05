package org.example.service.impl;

import org.example.entity.HerbalDetailed;
import org.example.persistence.HerbalDetailedMapper;
import org.example.service.HerbalDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("HerbalDetailedService")
public class HerbalDetailedServiceImpl implements HerbalDetailedService {
    @Autowired
    HerbalDetailedMapper herbalDetailedMapper;

    @Override
    public void addHerbalDetailed(HerbalDetailed herbalDetailed) {
        herbalDetailedMapper.insert(herbalDetailed);
    }

    @Override
    public void deleteHerbalDetailedById(int id) {
        herbalDetailedMapper.deleteById(id);
    }

    @Override
    public void updateHerbalDetailed(HerbalDetailed herbalDetailed) {
        herbalDetailedMapper.updateById(herbalDetailed);
    }

    @Override
    public HerbalDetailed getHerbalDetailedById(int id) {
        return herbalDetailedMapper.selectById(id);
    }
}
