package com.daizzyinfo.chipnavigation_demo.searchmodel;

import android.provider.ContactsContract;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchJsonModel {

String search;

    public SearchJsonModel(String search) {
        this.search = search;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }





}
