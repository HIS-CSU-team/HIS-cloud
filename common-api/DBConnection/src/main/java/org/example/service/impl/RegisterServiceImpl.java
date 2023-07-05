package org.example.service.impl;

import org.example.entity.Register;
import org.example.persistence.RegisterMapper;
import org.example.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RegisterService")
public class RegisterServiceImpl implements RegisterService {
    @Autowired
    RegisterMapper registerMapper;

    @Override
    public void addRegister(Register register) {
        registerMapper.insert(register);
    }

    @Override
    public void deleteRegisterById(int id) {
        registerMapper.deleteById(id);
    }

    @Override
    public void updateRegister(Register register) {
        registerMapper.updateById(register);
    }

    @Override
    public Register getRegisterById(int id) {
        return registerMapper.selectById(id);
    }
}
