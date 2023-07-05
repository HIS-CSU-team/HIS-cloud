package org.example.service;

import org.example.entity.DrugsTemplate;

public interface DrugsTemplateService {
    void addDrugsTemplate(DrugsTemplate drugsTemplate);
    void deleteDrugsTemplateById(int id);
    void updateDrugsTemplate(DrugsTemplate drugsTemplate);
    DrugsTemplate getDrugsTemplateById(int id);
}