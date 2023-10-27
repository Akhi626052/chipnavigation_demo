package com.daizzyinfo.chipnavigation_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TimeslotModel {



    @SerializedName("timeslot")
    @Expose
    private String timeslot;

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    public TimeslotModel(String timeslot) {
        this.timeslot = timeslot;
    }


/*    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<LawyersDetailsResponse> getData() {
        return data;
    }

    public void setData(List<LawyersDetailsResponse> data) {
        this.data = data;
    }*/





}
