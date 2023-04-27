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
    private int meter;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "com.example.networking.Mountain{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", meter=" + meter +
                ", items=" + items +
                '}';
    }

    ArrayList<RecyclerViewItem> items = new ArrayList<>(Arrays.asList(
            new RecyclerViewItem("Matterhorn"),
            new RecyclerViewItem("Mont Blanc"),
            new RecyclerViewItem("Denali")
    ));



    @SuppressWarnings("WeakerAccess")
    public class RecyclerViewItem {

        private String title;

        public RecyclerViewItem(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
}