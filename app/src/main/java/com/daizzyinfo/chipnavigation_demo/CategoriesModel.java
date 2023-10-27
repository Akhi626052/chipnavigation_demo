package com.daizzyinfo.chipnavigation_demo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CategoriesModel {
   /* int categories_ig;
    String categories_tv;

    public CategoriesModel(int categories_ig, String categories_tv) {
        this.categories_ig = categories_ig;
        this.categories_tv = categories_tv;
    }

    public int getCategories_ig() {
        return categories_ig;
    }

    public void setCategories_ig(int categories_ig) {
        this.categories_ig = categories_ig;
    }

    public String getCategories_tv() {
        return categories_tv;
    }

    public void setCategories_tv(String categories_tv) {
        this.categories_tv = categories_tv;
    }*/

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

        @SerializedName("cat_id")
        @Expose
        private Integer catId;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("slug")
        @Expose
        private Object slug;
        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public Integer getCatId() {
            return catId;
        }

        public void setCatId(Integer catId) {
            this.catId = catId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

       /* public int getImage() {
            return image;
        }

        public void setImage(int image) {
            image=(int) image;
        }*/

        public Object getSlug() {
            return slug;
        }

        public void setSlug(Object slug) {
            this.slug = slug;
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
