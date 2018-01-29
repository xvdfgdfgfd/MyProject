package com.io.controller;

import com.io.model.Resume;
import com.io.model.User;
import com.io.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;


    @RequestMapping(value = "/forAddResume",method = RequestMethod.POST)
    public String forAddResume()throws  Exception{
        return "addResume";
    }


    @RequestMapping(value = "/addResume",method = RequestMethod.POST)
    public String addResume(Resume resume, String birth, HttpSession session)throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(birth);
        resume.setR_birth(date);
        User user= (User) session.getAttribute("user");
        User user1 = new User();
        user1.setU_id(user.getU_id());
        resume.setUser(user1);
        System.out.println(user1);
        System.out.println(resume);
        if (resumeService.addResume(resume)){
            return "../../index";
        }
        return "../../index";
    }

    @RequestMapping(value = "/getResume",method = RequestMethod.POST)
    public String getResume(Resume resume,HttpSession session)throws Exception{
        User user= (User) session.getAttribute("user");
        User user1= new User();
        user1.setU_id(user.getU_id());
        resume.setUser(user1);
        List<Resume> resumes = resumeService.getResume(resume);
        if (resumes!=null){
            session.setAttribute("resumes",resumes);
            System.out.println(resumes);
            return "getResumes";
        }
        return "loginsuccess";
    }
}
