package com.daizzyinfo.chipnavigation_demo;

import android.widget.ImageView;

public class TopLawyersModel {
    int female;
    String ur_name,tv_det_inf,experience,lacation_tv,rupee,tex_rating;

    public TopLawyersModel(int female, String ur_name, String tv_det_inf, String experience, String lacation_tv, String rupee, String tex_rating) {
        this.female = female;
        this.ur_name = ur_name;
        this.tv_det_inf = tv_det_inf;
        this.experience = experience;
        this.lacation_tv = lacation_tv;
        this.rupee = rupee;
        this.tex_rating = tex_rating;
    }

    public int getFemale() {
        return female;
    }

    public void setFemale(int female) {
        this.female = female;
    }

    public String getUr_name() {
        return ur_name;
    }

    public void setUr_name(String ur_name) {
        this.ur_name = ur_name;
    }

    public String getTv_det_inf() {
        return tv_det_inf;
    }

    public void setTv_det_inf(String tv_det_inf) {
        this.tv_det_inf = tv_det_inf;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getLacation_tv() {
        return lacation_tv;
    }

    public void setLacation_tv(String lacation_tv) {
        this.lacation_tv = lacation_tv;
    }

    public String getRupee() {
        return rupee;
    }

    public void setRupee(String rupee) {
        this.rupee = rupee;
    }

    public String getTex_rating() {
        return tex_rating;
    }

    public void setTex_rating(String tex_rating) {
        this.tex_rating = tex_rating;
    }
}
