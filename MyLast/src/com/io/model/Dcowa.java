package com.io.model;

import java.io.Serializable;
import java.util.Date;

public class Dcowa implements Serializable {
    private int dc_id;
    private Date dc_time;
    private Staff staff;
    private String dc_mags;

    public Dcowa() {
    }

    public Dcowa(int dc_id, Date dc_time, Staff staff, String dc_mags) {
        this.dc_id = dc_id;
        this.dc_time = dc_time;
        this.staff = staff;
        this.dc_mags = dc_mags;
    }

    public int getDc_id() {
        return dc_id;
    }

    public void setDc_id(int dc_id) {
        this.dc_id = dc_id;
    }

    public Date getDc_time() {
        return dc_time;
    }

    public void setDc_time(Date dc_time) {
        this.dc_time = dc_time;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getDc_mags() {
        return dc_mags;
    }

    public void setDc_mags(String dc_mags) {
        this.dc_mags = dc_mags;
    }

    @Override
    public String toString() {
        return "Dcowa{" +
                "dc_id=" + dc_id +
                ", dc_time=" + dc_time +
                ", staff=" + staff +
                ", dc_mags='" + dc_mags + '\'' +
                '}';
    }
}
