package com.daizzyinfo.chipnavigation_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CorporateLawyersResponse {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("data")
    @Expose
    private List<CorporateLawyersModel.Datum> data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<CorporateLawyersModel.Datum> getData() {
        return data;
    }

    public void setData(List<CorporateLawyersModel.Datum> data) {
        this.data = data;
    }

}
