package com.io.model;

import java.io.Serializable;

public class User implements Serializable{
    private int u_id;
    private String u_name;
    private String u_pass;
    private int u_hire;
    private int u_intn;
    private String u_interview;

    public User() {
    }

    public User(int u_id, String u_name, String u_pass, int u_hire, int u_intn, String u_interview) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_pass = u_pass;
        this.u_hire = u_hire;
        this.u_intn = u_intn;
        this.u_interview = u_interview;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_pass() {
        return u_pass;
    }

    public void setU_pass(String u_pass) {
        this.u_pass = u_pass;
    }

    public int getU_hire() {
        return u_hire;
    }

    public void setU_hire(int u_hire) {
        this.u_hire = u_hire;
    }

    public int getU_intn() {
        return u_intn;
    }

    public void setU_intn(int u_intn) {
        this.u_intn = u_intn;
    }

    public String getU_interview() {
        return u_interview;
    }

    public void setU_interview(String u_interview) {
        this.u_interview = u_interview;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", u_pass='" + u_pass + '\'' +
                ", u_hire=" + u_hire +
                ", u_intn=" + u_intn +
                ", u_interview='" + u_interview + '\'' +
                '}';
    }
}
