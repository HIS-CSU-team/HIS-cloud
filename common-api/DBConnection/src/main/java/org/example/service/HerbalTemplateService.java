package org.example.service;

import org.example.entity.HerbalTemplate;

public interface HerbalTemplateService {
    void addHerbalTemplate(HerbalTemplate herbalTemplate);
    void deleteHerbalTemplateById(int id);
    void updateHerbalTemplate(HerbalTemplate herbalTemplate);
    HerbalTemplate getHerbalTemplateById(int id);
}