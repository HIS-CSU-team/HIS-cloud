package org.example.service.impl;

import org.example.entity.RegistWork;
import org.example.persistence.RegistWorkMapper;
import org.example.service.RegistWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RegistWorkService")
public class RegistWorkServiceImpl implements RegistWorkService {
    @Autowired
    RegistWorkMapper registWorkMapper;

    @Override
    public void addRegistWork(RegistWork registWork) {
        registWorkMapper.insert(registWork);
    }

    @Override
    public void deleteRegistWorkById(int id) {
        registWorkMapper.deleteById(id);
    }

    @Override
    public void updateRegistWork(RegistWork registWork) {
        registWorkMapper.updateById(registWork);
    }

    @Override
    public RegistWork getRegistWorkById(int id) {
        return registWorkMapper.selectById(id);
    }
}
