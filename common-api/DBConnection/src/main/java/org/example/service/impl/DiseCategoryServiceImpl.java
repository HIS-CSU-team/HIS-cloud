package org.example.service.impl;

import org.example.entity.DiseCategory;
import org.example.persistence.DiseCategoryMapper;
import org.example.service.DiseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DiseCategoryService")
public class DiseCategoryServiceImpl implements DiseCategoryService {
    @Autowired
    DiseCategoryMapper diseCategoryMapper;

    @Override
    public void addDiseCategory(DiseCategory diseCategory) {
        diseCategoryMapper.insert(diseCategory);
    }

    @Override
    public void deleteDiseCategoryById(int id) {
        diseCategoryMapper.deleteById(id);
    }

    @Override
    public void updateDiseCategory(DiseCategory diseCategory) {
        diseCategoryMapper.updateById(diseCategory);
    }

    @Override
    public DiseCategory getDiseCategoryById(int id) {
        return diseCategoryMapper.selectById(id);
    }
}
