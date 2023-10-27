package com.daizzyinfo.chipnavigation_demo.Model;

import android.widget.TextView;

public class PastModel {
    String text_name,text_age,date_id,Cn_id;

    public PastModel(String text_name, String text_age, String date_id, String cn_id) {
        this.text_name = text_name;
        this.text_age = text_age;
        this.date_id = date_id;
        Cn_id = cn_id;
    }

    public String getText_name() {
        return text_name;
    }

    public void setText_name(String text_name) {
        this.text_name = text_name;
    }

    public String getText_age() {
        return text_age;
    }

    public void setText_age(String text_age) {
        this.text_age = text_age;
    }

    public String getDate_id() {
        return date_id;
    }

    public void setDate_id(String date_id) {
        this.date_id = date_id;
    }

    public String getCn_id() {
        return Cn_id;
    }

    public void setCn_id(String cn_id) {
        Cn_id = cn_id;
    }
}
