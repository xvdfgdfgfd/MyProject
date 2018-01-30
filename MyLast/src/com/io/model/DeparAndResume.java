package com.io.model;

public class DeparAndResume {
    private int DR_ID;
    private int d_id;
    private int u_id;

    public DeparAndResume() {
    }

    public DeparAndResume(int DR_ID, int d_id, int u_id) {
        this.DR_ID = DR_ID;
        this.d_id = d_id;
        this.u_id = u_id;
    }

    public int getDR_ID() {
        return DR_ID;
    }

    public void setDR_ID(int DR_ID) {
        this.DR_ID = DR_ID;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    @Override
    public String toString() {
        return "DeparAndResume{" +
                "DR_ID=" + DR_ID +
                ", d_id=" + d_id +
                ", u_id=" + u_id +
                '}';
    }
}
