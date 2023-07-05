package org.example.service;

import org.example.entity.DrugsDetailed;

public interface DrugsDetailedService {
    void addDrugsDetailed(DrugsDetailed drugsDetailed);
    void deleteDrugsDetailedById(int id);
    void updateDrugsDetailed(DrugsDetailed drugsDetailed);
    DrugsDetailed getDrugsDetailedById(int id);
}