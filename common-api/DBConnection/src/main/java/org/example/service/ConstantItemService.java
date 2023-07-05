package org.example.service;

import org.example.entity.ConstantItem;

public interface ConstantItemService {
    void addConstantItem(ConstantItem constantItem);
    void deleteConstantItemById(int id);
    void updateConstantItem(ConstantItem constantItem);
    ConstantItem getConstantItemById(int id);
}