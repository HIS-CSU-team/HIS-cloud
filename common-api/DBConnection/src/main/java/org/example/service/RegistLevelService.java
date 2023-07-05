package org.example.service;

import org.example.entity.RegistLevel;

public interface RegistLevelService {

    void addRegistLevel(RegistLevel registLevel);

    void deleteRegistLevelById(int id);

    void updateRegistLevel(RegistLevel registLevel);

    RegistLevel getRegistLevelById(int id);
}