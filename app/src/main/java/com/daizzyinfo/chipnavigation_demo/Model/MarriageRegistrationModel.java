package com.daizzyinfo.chipnavigation_demo.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MarriageRegistrationModel {
//String mrg_details_id,mrg_details2_id;

    /*public MarriageRegistrationModel(String mrg_details_id, String mrg_details2_id) {
        this.mrg_details_id = mrg_details_id;
        this.mrg_details2_id = mrg_details2_id;
    }

    public String getMrg_details_id() {
        return mrg_details_id;
    }

    public void setMrg_details_id(String mrg_details_id) {
        this.mrg_details_id = mrg_details_id;
    }

    public String getMrg_details2_id() {
        return mrg_details2_id;
    }

    public void setMrg_details2_id(String mrg_details2_id) {
        this.mrg_details2_id = mrg_details2_id;
    }
*/

    @SerializedName("status")
    @Expose
    private Boolean status;
    @SerializedName("data")
    @Expose
    private List<Datum> data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public class Datum {

        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("title_name")
        @Expose
        private String titleName;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("user_type")
        @Expose
        private String userType;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTitleName() {
            return titleName;
        }

        public void setTitleName(String titleName) {
            this.titleName = titleName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

    }





}
