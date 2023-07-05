package org.example.service;

import org.example.entity.SettleCategory;

public interface SettleCategoryService {

    void addSettleCategory(SettleCategory settleCategory);

    void deleteSettleCategoryById(int id);

    void updateSettleCategory(SettleCategory settleCategory);

    SettleCategory getSettleCategoryById(int id);
}