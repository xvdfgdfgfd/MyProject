package com.io.controller;

import com.io.model.Department;
import com.io.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;


    @RequestMapping(value = "/getDepar",method = RequestMethod.POST)
    public String getDepar(Department department, HttpSession session)throws Exception {
        department.setD_statu(1);
        List<Department> departments = departmentService.getDepar(department);
        if (departments != null) {
            session.setAttribute("depar", departments);
            return "getDepar";
        }
        return "loginsuccess";

    }

    @RequestMapping(value = "/getAllDepat",method = RequestMethod.POST)
    public String getAllDepar(HttpSession session)throws Exception{
        List<Department> departments = departmentService.getAllDepat();
        if (departments!=null){
            session.setAttribute("allDepar",departments);
            return "makeDepar";
        }
        return "loginAdmin";
    }
}
