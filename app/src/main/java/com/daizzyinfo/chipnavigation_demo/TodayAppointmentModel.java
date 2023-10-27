package com.daizzyinfo.chipnavigation_demo;

public class TodayAppointmentModel {

    String user_name,time_and_date_user;

    public TodayAppointmentModel(String user_name, String time_and_date_user) {
        this.user_name = user_name;
        this.time_and_date_user = time_and_date_user;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getTime_and_date_user() {
        return time_and_date_user;
    }

    public void setTime_and_date_user(String time_and_date_user) {
        this.time_and_date_user = time_and_date_user;
    }
}
