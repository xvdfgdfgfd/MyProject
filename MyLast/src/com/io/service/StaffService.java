package com.io.service;

import com.io.model.Staff;

import java.util.List;

public interface StaffService {
    Staff loginStaff(Staff staff);
    Staff getStaff(Staff staff);
    List<Staff> getAllStaff();
    boolean addStaff(Staff staff);
}
