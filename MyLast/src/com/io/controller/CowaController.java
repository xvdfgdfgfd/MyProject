package com.io.controller;

import com.io.model.Cowa;
import com.io.model.Staff;
import com.io.service.CowaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class CowaController {
    @Resource
    private CowaService cowaService;


    /*
    *
    * 上班打卡*/
    @RequestMapping(value = "/addCowa", method = RequestMethod.POST)
    public String addCowa(Cowa cowa, HttpSession session) throws Exception {
        Staff staff = (Staff) session.getAttribute("staff");
        Staff staff1 = new Staff();
        staff1.setS_id(staff.getS_id());
        Date now = new Date();
        cowa.setC_time(now);
        cowa.setStaff(staff1);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf1.format(now);
        String string = str + " 15:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now1 = new Date();
        Date s = sdf.parse(string);
        long l1 = s.getTime();
        long l2 = now1.getTime();
        long num = ((l2 - l1) / 1000 / 60 );
        if (l2-l1<=0) {
            cowa.setC_mags("正常");
            cowaService.addCowa(cowa);
            return "loginStaffSuccess";
        } else if (num >= 0 && num <= 60) {
            cowa.setC_mags("迟到1小时");
            cowaService.addCowa(cowa);
            return "loginStaffSuccess";
        } else if (num >= 60 && num <= 120) {
            cowa.setC_mags("迟到2小时");
            cowaService.addCowa(cowa);
            return "loginStaffSuccess";
        } else if (num >= 180) {
            cowa.setC_mags("旷工");
            cowaService.addCowa(cowa);
            return "loginStaffSuccess";
        }
        return "loginStaffSuccess";
    }
}
