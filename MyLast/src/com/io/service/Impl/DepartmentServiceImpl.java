package com.io.service.Impl;

import com.io.dao.DepartmentMapper;
import com.io.model.Department;
import com.io.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> getDepar(Department department) {
        List<Department> departments = departmentMapper.getDepar(department);
        if (departments!=null){
            return departments;
        }
        return null;
    }

    @Override
    public List<Department> getAllDepat() {
        return departmentMapper.getAllDepat();
    }
}
