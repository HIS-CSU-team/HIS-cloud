package org.example.service;

import org.example.entity.Register;

public interface RegisterService {

    void addRegister(Register register);

    void deleteRegisterById(int id);

    void updateRegister(Register register);

    Register getRegisterById(int id);
}