package com.daizzyinfo.chipnavigation_demo.Model;

import java.util.ArrayList;
import java.util.List;

public class LawyersDetailsJsonModel{

    String ls_uid, user_type;

    public LawyersDetailsJsonModel(String ls_uid, String user_type) {
        this.ls_uid = ls_uid;
        this.user_type = user_type;


    }

    public String getLs_uid() {
        return ls_uid;
    }

    public void setLs_uid(String ls_uid) {
        this.ls_uid = ls_uid;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }



}
