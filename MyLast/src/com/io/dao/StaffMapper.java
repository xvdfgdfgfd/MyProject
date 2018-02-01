package com.io.dao;

import com.io.model.Staff;

import java.util.List;

public interface StaffMapper {
    Staff loginStaff(Staff staff);
    Staff getStaff(Staff staff);
    List<Staff> getAllStaff();
    boolean addStaff(Staff staff);
}
