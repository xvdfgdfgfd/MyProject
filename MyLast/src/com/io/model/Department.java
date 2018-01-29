package com.io.model;

import java.io.Serializable;

public class Department implements Serializable {
    private int d_id;
    private String d_name;
    private int d_statu;

    public Department(int d_id, String d_name, int d_statu) {
        this.d_id = d_id;
        this.d_name = d_name;
        this.d_statu = d_statu;
    }

    public Department() {
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public int getD_statu() {
        return d_statu;
    }

    public void setD_statu(int d_statu) {
        this.d_statu = d_statu;
    }

    @Override
    public String toString() {
        return "Department{" +
                "d_id=" + d_id +
                ", d_name='" + d_name + '\'' +
                ", d_statu=" + d_statu +
                '}';
    }
}
