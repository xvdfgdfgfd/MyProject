package com.io.controller;

import com.io.model.DeparAndResume;
import com.io.model.Department;
import com.io.model.Resume;
import com.io.model.User;
import com.io.service.DeparAndResumeService;
import com.io.service.ResumeService;
import com.io.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class DeparAndResumeController {
    @Resource
    private DeparAndResumeService deparAndResumeService;
    @Resource
    private ResumeService resumeService;
    @Resource
    private UserService userService;

    @RequestMapping(value = "/addDeparAndRes",method = RequestMethod.POST)
    public String addDeparAndRes(int ddid,HttpSession session)throws Exception{
        System.out.println(ddid);
        Department department = new Department();
        department.setD_id(ddid);
        User user = (User) session.getAttribute("user");
        User user1 = new User();
        user1.setU_id(user.getU_id());
        DeparAndResume deparAndResume = new DeparAndResume();
        deparAndResume.setD_id(ddid);
        deparAndResume.setU_id(user.getU_id());
        if (deparAndResumeService.addDeparAndRes(deparAndResume)){
            return "loginSuccess";
        }
        return "getDepar";
    }

    @RequestMapping(value = "/getDandR",method = RequestMethod.POST)
    public String getDandR(HttpSession session)throws Exception{
        List<DeparAndResume> deparAndResumes = deparAndResumeService.getDandR();
        if (deparAndResumes!=null){
            session.setAttribute("dAndr",deparAndResumes);
            System.out.println(deparAndResumes);
            return "getDandR";
        }
        return "loginAdmin";
    }

    @RequestMapping(value = "/adminGetResume",method = RequestMethod.POST)
    public String adminGetResume(int uid,HttpSession session)throws Exception{
        User user  = new User();
        user.setU_id(uid);
        Resume resume = new Resume();
        resume.setUser(user);
        List<Resume> resumes = resumeService.getResume(resume);
        if (resumes!=null){
            session.setAttribute("adminGetResume",resumes);
            System.out.println(resumes);
            return "adminGetResume";
        }
        return "loginAdmin";
    }

    @RequestMapping(value = "/invite",method = RequestMethod.POST)
    public String invite(User user,int drid,int uid)throws Exception{
        user.setU_id(uid);
        user.setU_intn(drid);
        if (userService.updateUser(user)){
            return "loginAdmin";
        }
        return "loginAdmin";
    }
}
