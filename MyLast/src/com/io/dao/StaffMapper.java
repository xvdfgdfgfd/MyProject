package com.io.dao;

import com.io.model.Staff;

public interface StaffMapper {
    Staff loginStaff(Staff staff);
    Staff getStaff(Staff staff);
    boolean addStaff(Staff staff);
}
