package com.daizzyinfo.chipnavigation_demo;

public class UpcomingModel {

    String txt_name,txt_age,dt_id,UpcmStatus;

    public UpcomingModel(String txt_name, String txt_age, String dt_id, String upcmStatus) {
        this.txt_name = txt_name;
        this.txt_age = txt_age;
        this.dt_id = dt_id;
        UpcmStatus = upcmStatus;
    }

    public String getTxt_name() {
        return txt_name;
    }

    public void setTxt_name(String txt_name) {
        this.txt_name = txt_name;
    }

    public String getTxt_age() {
        return txt_age;
    }

    public void setTxt_age(String txt_age) {
        this.txt_age = txt_age;
    }

    public String getDt_id() {
        return dt_id;
    }

    public void setDt_id(String dt_id) {
        this.dt_id = dt_id;
    }

    public String getUpcmStatus() {
        return UpcmStatus;
    }

    public void setUpcmStatus(String upcmStatus) {
        UpcmStatus = upcmStatus;
    }
}
