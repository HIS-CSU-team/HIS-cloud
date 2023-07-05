package org.example.service;

import org.example.entity.DiseCategory;

public interface DiseCategoryService {
    void addDiseCategory(DiseCategory diseCategory);
    void deleteDiseCategoryById(int id);
    void updateDiseCategory(DiseCategory diseCategory);
    DiseCategory getDiseCategoryById(int id);
}