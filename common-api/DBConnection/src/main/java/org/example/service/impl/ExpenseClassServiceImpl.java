package org.example.service.impl;

import org.example.entity.ExpenseClass;
import org.example.persistence.ExpenseClassMapper;
import org.example.service.ExpenseClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ExpenseClassService")
public class ExpenseClassServiceImpl implements ExpenseClassService {
    @Autowired
    ExpenseClassMapper expenseClassMapper;

    @Override
    public void addExpenseClass(ExpenseClass expenseClass) {
        expenseClassMapper.insert(expenseClass);
    }

    @Override
    public void deleteExpenseClassById(int id) {
        expenseClassMapper.deleteById(id);
    }

    @Override
    public void updateExpenseClass(ExpenseClass expenseClass) {
        expenseClassMapper.updateById(expenseClass);
    }

    @Override
    public ExpenseClass getExpenseClassById(int id) {
        return expenseClassMapper.selectById(id);
    }
}
