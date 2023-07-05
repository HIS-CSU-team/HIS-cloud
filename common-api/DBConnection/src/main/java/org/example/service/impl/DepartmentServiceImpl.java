package org.example.service.impl;

import org.example.entity.Department;
import org.example.persistence.DepartmentMapper;
import org.example.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public void addDepartment(Department department) {
        departmentMapper.insert(department);
    }

    @Override
    public void deleteDepartmentById(int id) {
        departmentMapper.deleteById(id);
    }

    @Override
    public void updateDepartment(Department department) {
        departmentMapper.updateById(department);
    }

    @Override
    public Department getDepartmentById(int id) {
        return departmentMapper.selectById(id);
    }
}
