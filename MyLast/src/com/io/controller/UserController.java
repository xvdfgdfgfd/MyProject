package com.io.controller;

import com.io.model.User;
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

    /**
     * Ìø×ªµ½×¢²á½çÃæ
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/forAdd",method = RequestMethod.POST)
    public String forAdd()throws Exception{
        return "addUser";
    }

   /*×¢²áÊ§°ÜÌø×ªµ½×¢²á*/
    @RequestMapping(value = "addFailure")
    public String addFailure()throws Exception{
        return "addUser";
    }
/*×¢²á·½·¨*/
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

    /*µÇÂ¼*/
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user, HttpSession session)throws  Exception{
        User user1 = userService.login(user);
        if (user1!=null){
            session.setAttribute("user",user1);
            return "loginSuccess";
        }else {
            return "loginFailure";
        }
    }
}

