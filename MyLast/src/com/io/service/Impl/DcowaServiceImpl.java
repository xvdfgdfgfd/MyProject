package com.io.service.Impl;

import com.io.dao.DcowaMapper;
import com.io.model.Dcowa;
import com.io.service.DcowaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class DcowaServiceImpl implements DcowaService{
    @Resource
    private DcowaMapper dcowaMapper;
    @Override
    public boolean addDcowa(Dcowa dcowa) {
        if (dcowaMapper.addDcowa(dcowa)){
            return true;
        }
        return false;
    }
}
