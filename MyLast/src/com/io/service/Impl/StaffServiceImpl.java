package com.io.service.Impl;

import com.io.dao.StaffMapper;
import com.io.model.Staff;
import com.io.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("staffService")
public class StaffServiceImpl implements StaffService {
    @Resource
    private StaffMapper staffMapper;

    @Override
    public Staff loginStaff(Staff staff) {
        Staff staff1 = staffMapper.loginStaff(staff);
        if (staff1!=null){
            return staff1;
        }
        return null;
    }

    @Override
    public Staff getStaff(Staff staff) {
        Staff staff1 = staffMapper.getStaff(staff);
        if (staff1!=null){
            return staff1;
        }
        return null;
    }

    @Override
    public boolean addStaff(Staff staff) {
        return staffMapper.addStaff(staff);
    }
}
