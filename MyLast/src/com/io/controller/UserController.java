package com.io.controller;

import com.io.model.DeparAndResume;
import com.io.model.User;
import com.io.service.DeparAndResumeService;
import com.io.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Resource
    private UserService userService;
    @Resource
    private DeparAndResumeService deparAndResumeService;
    /**
     * ��ת��ע�����
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/forAdd",method = RequestMethod.POST)
    public String forAdd()throws Exception{
        return "addUser";
    }

   /*ע��ʧ����ת��ע��*/
    @RequestMapping(value = "addFailure")
    public String addFailure()throws Exception{
        return "addUser";
    }
    /*
    * ��ת����Ա����¼*/
    @RequestMapping(value = "/forStafflogin")
    public String forStafflogin()throws Exception{
        return "loginStaff";
    }
/*ע�᷽��*/
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(User user)throws Exception {
        User user1 = userService.addBefore(user);
        System.out.println(user1);
        System.out.println(user.getU_name());
        if (user1==null||!user1.getU_name().equals(user.getU_name())){
            userService.addUser(user);
            return "addSuccess";
        }else {
            return "addFailure";
        }
    }

    /*��¼*/
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user, HttpSession session)throws  Exception{
        User user1 = userService.login(user);
        if (user1!=null){
            if(user1.getU_name().equals("admin")&&user1.getU_pass().equals("admin")){
                return "loginAdmin";
            }else {
                session.setAttribute("user",user1);
                return "loginSuccess";
            }
        }
        return "../../index";
    }

    @RequestMapping(value = "/gotoin",method = RequestMethod.POST)
    public String gotoin(int drid,HttpSession session)throws Exception{
        DeparAndResume deparAndResume = new DeparAndResume();
        deparAndResume.setDR_ID(drid);
        deparAndResume.setDr_statu(1);
        User user = (User) session.getAttribute("user");
        User user1 = new User();
        user1.setU_id(user.getU_id());
        user1.setU_intn(0);
        user1.setU_interview("");
        userService.updateUser(user1);
        if (deparAndResumeService.updateDandR(deparAndResume)){
            return "loginSuccess";
        }
        return "loginSuccess";
    }
}

