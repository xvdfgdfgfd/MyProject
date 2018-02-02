package com.io.controller;

import com.io.model.Dcowa;
import com.io.model.Staff;
import com.io.service.DcowaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DcowaController {
    @Resource
    private DcowaService dcowaService;

    @RequestMapping(value = "/addDcowa",method = RequestMethod.POST)
    public String addDcowa(Dcowa dcowa, HttpSession session)throws Exception {
        Staff staff = (Staff) session.getAttribute("staff");
        Staff staff1 = new Staff();
        staff1.setS_id(staff.getS_id());
        Date now = new Date();
        dcowa.setDc_time(now);
        dcowa.setStaff(staff1);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf1.format(now);
        String string = str + " 18:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now1 = new Date();
        Date s = sdf.parse(string);
        long l1 = s.getTime();
        long l2 = now1.getTime();
        long num = ((l2 - l1) / 1000 / -60);
        if (l2 - l1 >= 0) {
            dcowa.setDc_mags("正常");
            dcowaService.addDcowa(dcowa);
            return "loginStaffSuccess";
        } else if (num >= 0 && num <= 60) {
            dcowa.setDc_mags("早退1小时");
            dcowaService.addDcowa(dcowa);
            return "loginStaffSuccess";
        } else if (num >= 60 && num < 120) {
            dcowa.setDc_mags("早退2小时");
            dcowaService.addDcowa(dcowa);
            return "loginStaffSuccess";
        } else if (num >= 180) {
            dcowa.setDc_mags("矿工");
            dcowaService.addDcowa(dcowa);
            return "loginStaffSuccess";
        }
        return "loginStaffSuccess";
    }
}
