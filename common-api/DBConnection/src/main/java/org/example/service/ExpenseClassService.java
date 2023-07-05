package org.example.service;

import org.example.entity.ExpenseClass;

public interface ExpenseClassService {
    void addExpenseClass(ExpenseClass expenseClass);
    void deleteExpenseClassById(int id);
    void updateExpenseClass(ExpenseClass expenseClass);
    ExpenseClass getExpenseClassById(int id);
}