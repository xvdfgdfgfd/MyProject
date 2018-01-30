package com.io.service;

import com.io.model.Staff;

public interface StaffService {
    Staff loginStaff(Staff staff);
    Staff getStaff(Staff staff);
    boolean addStaff(Staff staff);
}
