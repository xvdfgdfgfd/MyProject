package com.io.model;

import java.io.Serializable;
import java.util.Date;

public class Resume implements Serializable {
    private int r_id;
    private String r_name;
    private String r_sex;
    private String r_nation;
    private String r_phone;
    private String r_emall;
    private String r_address;
    private Date r_birth;
    private String r_politics_status;
    private String r_graduate;
    private String r_education;
    private String r_job_intension;
    private String r_educational;
    private String r_internship;
    private String r_skill;
    private String r_self;
    private User user;

    public Resume() {
    }

    public Resume(int r_id, String r_name, String r_sex, String r_nation, String r_phone, String r_emall, String r_address, Date r_birth, String r_politics_status, String r_graduate, String r_education, String r_job_intension, String r_educational, String r_internship, String r_skill, String r_self, User user) {
        this.r_id = r_id;
        this.r_name = r_name;
        this.r_sex = r_sex;
        this.r_nation = r_nation;
        this.r_phone = r_phone;
        this.r_emall = r_emall;
        this.r_address = r_address;
        this.r_birth = r_birth;
        this.r_politics_status = r_politics_status;
        this.r_graduate = r_graduate;
        this.r_education = r_education;
        this.r_job_intension = r_job_intension;
        this.r_educational = r_educational;
        this.r_internship = r_internship;
        this.r_skill = r_skill;
        this.r_self = r_self;
        this.user = user;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getR_name() {
        return r_name;
    }

    public void setR_name(String r_name) {
        this.r_name = r_name;
    }

    public String getR_sex() {
        return r_sex;
    }

    public void setR_sex(String r_sex) {
        this.r_sex = r_sex;
    }

    public String getR_nation() {
        return r_nation;
    }

    public void setR_nation(String r_nation) {
        this.r_nation = r_nation;
    }

    public String getR_phone() {
        return r_phone;
    }

    public void setR_phone(String r_phone) {
        this.r_phone = r_phone;
    }

    public String getR_emall() {
        return r_emall;
    }

    public void setR_emall(String r_emall) {
        this.r_emall = r_emall;
    }

    public String getR_address() {
        return r_address;
    }

    public void setR_address(String r_address) {
        this.r_address = r_address;
    }

    public Date getR_birth() {
        return r_birth;
    }

    public void setR_birth(Date r_birth) {
        this.r_birth = r_birth;
    }

    public String getR_politics_status() {
        return r_politics_status;
    }

    public void setR_politics_status(String r_politics_status) {
        this.r_politics_status = r_politics_status;
    }

    public String getR_graduate() {
        return r_graduate;
    }

    public void setR_graduate(String r_graduate) {
        this.r_graduate = r_graduate;
    }

    public String getR_education() {
        return r_education;
    }

    public void setR_education(String r_education) {
        this.r_education = r_education;
    }

    public String getR_job_intension() {
        return r_job_intension;
    }

    public void setR_job_intension(String r_job_intension) {
        this.r_job_intension = r_job_intension;
    }

    public String getR_educational() {
        return r_educational;
    }

    public void setR_educational(String r_educational) {
        this.r_educational = r_educational;
    }

    public String getR_internship() {
        return r_internship;
    }

    public void setR_internship(String r_internship) {
        this.r_internship = r_internship;
    }

    public String getR_skill() {
        return r_skill;
    }

    public void setR_skill(String r_skill) {
        this.r_skill = r_skill;
    }

    public String getR_self() {
        return r_self;
    }

    public void setR_self(String r_self) {
        this.r_self = r_self;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "r_id=" + r_id +
                ", r_name='" + r_name + '\'' +
                ", r_sex='" + r_sex + '\'' +
                ", r_nation='" + r_nation + '\'' +
                ", r_phone='" + r_phone + '\'' +
                ", r_emall='" + r_emall + '\'' +
                ", r_address='" + r_address + '\'' +
                ", r_birth=" + r_birth +
                ", r_politics_status='" + r_politics_status + '\'' +
                ", r_graduate='" + r_graduate + '\'' +
                ", r_education='" + r_education + '\'' +
                ", r_job_intension='" + r_job_intension + '\'' +
                ", r_educational='" + r_educational + '\'' +
                ", r_internship='" + r_internship + '\'' +
                ", r_skill='" + r_skill + '\'' +
                ", r_self='" + r_self + '\'' +
                ", user=" + user +
                '}';
    }
}
