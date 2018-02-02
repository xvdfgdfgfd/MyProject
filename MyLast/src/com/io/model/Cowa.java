package com.io.model;

import java.io.Serializable;
import java.util.Date;

public class Cowa implements Serializable{
    private int c_id;
    private Date c_time;
    private Staff staff;
    private String c_mags;

    public Cowa() {
    }

    public Cowa(int c_id, Date c_time, Staff staff, String c_mags) {
        this.c_id = c_id;
        this.c_time = c_time;
        this.staff = staff;
        this.c_mags = c_mags;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public Date getC_time() {
        return c_time;
    }

    public void setC_time(Date c_time) {
        this.c_time = c_time;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getC_mags() {
        return c_mags;
    }

    public void setC_mags(String c_mags) {
        this.c_mags = c_mags;
    }

    @Override
    public String toString() {
        return "Cowa{" +
                "c_id=" + c_id +
                ", c_time=" + c_time +
                ", staff=" + staff +
                ", c_mags='" + c_mags + '\'' +
                '}';
    }
}
