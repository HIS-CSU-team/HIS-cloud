package org.example.service;

import org.example.entity.CheckTemplate;

public interface CheckTemplateService {
    void addCheckTemplate(CheckTemplate checkTemplate);
    void deleteCheckTemplateById(int id);
    void updateCheckTemplate(CheckTemplate checkTemplate);
    CheckTemplate getCheckTemplateById(int id);
}