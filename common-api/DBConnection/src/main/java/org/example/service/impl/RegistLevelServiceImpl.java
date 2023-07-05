package org.example.service.impl;

import org.example.entity.RegistLevel;
import org.example.persistence.RegistLevelMapper;
import org.example.service.RegistLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RegistLevelService")
public class RegistLevelServiceImpl implements RegistLevelService {
    @Autowired
    RegistLevelMapper registLevelMapper;

    @Override
    public void addRegistLevel(RegistLevel registLevel) {
        registLevelMapper.insert(registLevel);
    }

    @Override
    public void deleteRegistLevelById(int id) {
        registLevelMapper.deleteById(id);
    }

    @Override
    public void updateRegistLevel(RegistLevel registLevel) {
        registLevelMapper.updateById(registLevel);
    }

    @Override
    public RegistLevel getRegistLevelById(int id) {
        return registLevelMapper.selectById(id);
    }
}
