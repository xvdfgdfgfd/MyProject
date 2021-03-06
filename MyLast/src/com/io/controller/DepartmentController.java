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


    /*
    * 根据ID找简历*/
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
    /*
    * 查看所有招聘信息*/
    @RequestMapping(value = "/getAllDepat",method = RequestMethod.POST)
    public String getAllDepar(HttpSession session)throws Exception{
        List<Department> departments = departmentService.getAllDepat();
        if (departments!=null){
            session.setAttribute("allDepar",departments);
            return "makeDepar";
        }
        return "loginAdmin";
    }

    /*
    *
    * 发布招聘*/
    @RequestMapping(value = "/updateDepar",method = RequestMethod.POST)
    public String updateDepar(Department department,int did)throws Exception{
        department.setD_statu(1);
        department.setD_id(did);
        if (departmentService.updateDepar(department)){
            return "loginAdmin";

        }
        return "loginAdmin";
    }

    /*
    * 取消招聘*/
    @RequestMapping(value = "/downDepar",method = RequestMethod.POST)
    public String downDepar(Department department,int did)throws Exception{
        department.setD_statu(0);
        department.setD_id(did);
        if (departmentService.updateDepar(department)){
            return "loginAdmin";
        }
        return "loginAdmin";
    }
}
