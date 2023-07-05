package org.example.service;

import org.example.entity.Disease;

public interface DiseaseService {
    void addDisease(Disease disease);
    void deleteDiseaseById(int id);
    void updateDisease(Disease disease);
    Disease getDiseaseById(int id);
}