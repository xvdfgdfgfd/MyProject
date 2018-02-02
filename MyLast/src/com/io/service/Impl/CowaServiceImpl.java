package com.io.service.Impl;

import com.io.dao.CowaMapper;
import com.io.model.Cowa;
import com.io.service.CowaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("cowaService")
public class CowaServiceImpl implements CowaService {
    @Resource
    private CowaMapper cowaMapper;
    @Override
    public boolean addCowa(Cowa cowa) {
        if (cowaMapper.addCowa(cowa)){
            return true;
        }
        return false;
    }
}
