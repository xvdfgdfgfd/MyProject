package com.io.dao;

import com.io.model.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> getDepar(Department department);
    List<Department> getAllDepat();
}
