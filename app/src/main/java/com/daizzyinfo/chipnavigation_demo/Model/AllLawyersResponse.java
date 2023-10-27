package com.daizzyinfo.chipnavigation_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllLawyersResponse {


        @SerializedName("status")
        @Expose
        private Boolean status;
        @SerializedName("data")
        @Expose
        private List<AllLawyersModel> data;

        public Boolean getStatus() {

            return status;

        }

        public void setStatus(Boolean status) {
            this.status = status;
        }

        public List<AllLawyersModel> getData() {
            return data;
        }

        public void setData(List<AllLawyersModel> data) {
            this.data = data;

        }

    }







