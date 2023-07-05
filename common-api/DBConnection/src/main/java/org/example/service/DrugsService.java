package org.example.service;

import org.example.entity.Drugs;

public interface DrugsService {
    void addDrug(Drugs drugs);
    void deleteDrugById(int id);
    void updateDrug(Drugs drugs);
    Drugs getDrugById(int id);
}