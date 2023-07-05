package org.example.service;

import org.example.entity.CheckRelation;

public interface CheckRelationService {
    void addCheckRelation(CheckRelation checkRelation);
    void deleteCheckRelationById(int id);
    void updateCheckRelation(CheckRelation checkRelation);
    CheckRelation getCheckRelationById(int id);
}