package com.io.model;

import java.io.Serializable;
import java.util.Date;

public class Staff implements Serializable {
    private int s_id;
    private String s_name;
    private String s_pass;
    private String s_position;
    private int s_salary;
    private String s_aandp;
    private int s_cowa;
    private Department department;

    public Staff() {
    }

    public Staff(int s_id, String s_name, String s_pass, String s_position, int s_salary, String s_aandp, int s_cowa, Department department) {
        this.s_id = s_id;
        this.s_name = s_name;
        this.s_pass = s_pass;
        this.s_position = s_position;
        this.s_salary = s_salary;
        this.s_aandp = s_aandp;
        this.s_cowa = s_cowa;
        this.department = department;
    }

    public int getS_id() {
        return s_id;
    }

    public void setS_id(int s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_pass() {
        return s_pass;
    }

    public void setS_pass(String s_pass) {
        this.s_pass = s_pass;
    }

    public String getS_position() {
        return s_position;
    }

    public void setS_position(String s_position) {
        this.s_position = s_position;
    }

    public int getS_salary() {
        return s_salary;
    }

    public void setS_salary(int s_salary) {
        this.s_salary = s_salary;
    }

    public String getS_aandp() {
        return s_aandp;
    }

    public void setS_aandp(String s_aandp) {
        this.s_aandp = s_aandp;
    }

    public int getS_cowa() {
        return s_cowa;
    }

    public void setS_cowa(int s_cowa) {
        this.s_cowa = s_cowa;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "s_id=" + s_id +
                ", s_name='" + s_name + '\'' +
                ", s_pass='" + s_pass + '\'' +
                ", s_position='" + s_position + '\'' +
                ", s_salary=" + s_salary +
                ", s_aandp='" + s_aandp + '\'' +
                ", s_cowa=" + s_cowa +
                ", department=" + department +
                '}';
    }
}
