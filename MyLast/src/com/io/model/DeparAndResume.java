package com.io.model;

public class DeparAndResume {
    private int DR_ID;
    private int d_id;
    private int u_id;
    private int dr_statu;

    public DeparAndResume() {
    }

    public DeparAndResume(int DR_ID, int d_id, int u_id, int dr_statu) {
        this.DR_ID = DR_ID;
        this.d_id = d_id;
        this.u_id = u_id;
        this.dr_statu = dr_statu;
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

    public int getDr_statu() {
        return dr_statu;
    }

    public void setDr_statu(int dr_statu) {
        this.dr_statu = dr_statu;
    }

    @Override
    public String toString() {
        return "DeparAndResume{" +
                "DR_ID=" + DR_ID +
                ", d_id=" + d_id +
                ", u_id=" + u_id +
                ", dr_statu=" + dr_statu +
                '}';
    }
}
