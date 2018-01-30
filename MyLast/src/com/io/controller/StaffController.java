package com.io.controller;

import com.io.model.Department;
import com.io.model.Staff;
import com.io.model.User;
import com.io.service.StaffService;
import com.io.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class StaffController {
    @Resource
    private StaffService staffService;
    @Resource
    private UserService userService;

    /*
    * 员工登录*/
    @RequestMapping(value = "/loginStaff",method = RequestMethod.POST)
    public String loginStaff(Staff staff, HttpSession session)throws Exception{
        Staff staff1 = staffService.loginStaff(staff);
        if (staff1!=null){
            session.setAttribute("staff",staff1);
            return "loginStaffSuccess";
        }
        return "../../index";
    }

    /*
    * 员工详细信息*/
    @RequestMapping(value = "/lookStaff",method = RequestMethod.POST)
    public String lookStaff(Staff staff,HttpSession session)throws Exception{
        Staff staff1 = (Staff) session.getAttribute("staff");
        staff.setS_id(staff1.getS_id());
        Staff staff2 = staffService.getStaff(staff);
        if (staff2!=null){
            session.setAttribute("staff2",staff2);
            return "lookStaff";
        }
        return "loginStaffSuccess";
    }
    /*
    *
    * 录用后添加到员工*/
    @RequestMapping(value = "/addStaff",method = RequestMethod.POST)
    public String addStaff(Staff staff, int drid, int uid,int salary)throws Exception{
        Department department = new Department();
        department.setD_id(drid);
        User user =  new User();
        user.setU_id(uid);
        user.setU_hire(1);
        userService.updateUserByHire(user);
        User user1 =  userService.getUserById(user);
        staff.setS_name(user1.getU_name());
        staff.setS_pass(user1.getU_pass());
        staff.setS_position("普通员工");
        staff.setS_salary(salary);
        staff.setS_aandp("无");
        staff.setS_cowa(0);
        staff.setDepartment(department);
        if (staffService.addStaff(staff)){
            return "loginAdmin";
        }
        return "loginAdmin";
    }
}
