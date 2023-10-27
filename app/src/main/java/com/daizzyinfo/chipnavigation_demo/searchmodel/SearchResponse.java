package com.daizzyinfo.chipnavigation_demo.searchmodel;

import android.provider.ContactsContract;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchResponse {

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("data")
    @Expose
    private Data data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }



    public class Data {

        @SerializedName("category")
        @Expose
        private List<CategoryModel> category;
        @SerializedName("lawyer")
        @Expose
        private List<LawyerModel> lawyer;

        public List<CategoryModel> getCategory() {
            return category;
        }

        public void setCategory(List<CategoryModel> category) {
            this.category = category;
        }

        public List<LawyerModel> getLawyer() {
            return lawyer;
        }

        public void setLawyer(List<LawyerModel> lawyer) {
            this.lawyer = lawyer;
        }

    }





}
