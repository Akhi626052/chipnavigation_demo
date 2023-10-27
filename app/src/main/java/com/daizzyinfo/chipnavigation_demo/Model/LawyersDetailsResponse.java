package com.daizzyinfo.chipnavigation_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;


public class LawyersDetailsResponse {


    @SerializedName("status")
    @Expose
    private Boolean status;

    @SerializedName("data")
    @Expose
    private List<LawyersDetailsModel> data;

    public Boolean getStatus() {

        return status;
    }

    public void setStatus(Boolean status) {

        this.status = status;
    }

    public List<LawyersDetailsModel> getData() {

        return data;

    }

    public void setData(List<LawyersDetailsModel> data) {

        this.data = data;

    }


}
