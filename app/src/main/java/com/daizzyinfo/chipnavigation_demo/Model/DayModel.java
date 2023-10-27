package com.daizzyinfo.chipnavigation_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DayModel {



    @SerializedName("pick_days")
    @Expose
    private String pickDays;

    public String getPickDays() {
        return pickDays;
    }

    public void setPickDays(String pickDays) {
        this.pickDays = pickDays;
    }







}
