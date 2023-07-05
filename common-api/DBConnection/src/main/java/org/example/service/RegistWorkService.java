package org.example.service;

import org.example.entity.RegistWork;

public interface RegistWorkService {

    void addRegistWork(RegistWork registWork);

    void deleteRegistWorkById(int id);

    void updateRegistWork(RegistWork registWork);

    RegistWork getRegistWorkById(int id);
}