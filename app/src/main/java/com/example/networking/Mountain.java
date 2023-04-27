package com.example.networking;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;

public class Mountain {

    public static int length;
    private String ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    @SerializedName("size")


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }





}