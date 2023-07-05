package org.example.service.impl;

import org.example.entity.HerbalTempDetailed;
import org.example.persistence.HerbalTempDetailedMapper;
import org.example.service.HerbalTempDetailedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("HerbalTempDetailedService")
public class HerbalTempDetailedServiceImpl implements HerbalTempDetailedService {
    @Autowired
    HerbalTempDetailedMapper herbalTempDetailedMapper;

    @Override
    public void addHerbalTempDetailed(HerbalTempDetailed herbalTempDetailed) {
        herbalTempDetailedMapper.insert(herbalTempDetailed);
    }

    @Override
    public void deleteHerbalTempDetailedById(int id) {
        herbalTempDetailedMapper.deleteById(id);
    }

    @Override
    public void updateHerbalTempDetailed(HerbalTempDetailed herbalTempDetailed) {
        herbalTempDetailedMapper.updateById(herbalTempDetailed);
    }

    @Override
    public HerbalTempDetailed getHerbalTempDetailedById(int id) {
        return herbalTempDetailedMapper.selectById(id);
    }
}
