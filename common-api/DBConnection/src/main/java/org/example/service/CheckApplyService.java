package org.example.service;

import org.example.entity.CheckApply;

public interface CheckApplyService {
    void addCheckApply(CheckApply checkApply);
    void deleteCheckApplyById(int id);
    void updateCheckApply(CheckApply checkApply);
    CheckApply getCheckApplyById(int id);
}