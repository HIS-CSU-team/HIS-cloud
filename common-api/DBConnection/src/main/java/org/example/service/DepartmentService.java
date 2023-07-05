package org.example.service;

import org.example.entity.Department;

public interface DepartmentService {
    void addDepartment(Department department);
    void deleteDepartmentById(int id);
    void updateDepartment(Department department);
    Department getDepartmentById(int id);
}