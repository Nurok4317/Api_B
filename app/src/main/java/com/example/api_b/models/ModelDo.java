package com.example.api_b.models;

import com.google.gson.annotations.SerializedName;
public class ModelDo {
    @SerializedName("key")
    private   String key;

    @SerializedName("activity")
    private   String activity;

    @SerializedName("link")
    private   String link;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @SerializedName("accessibility")
    private   String accessibility;

    public String getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(String description) {
        this.accessibility = description;
    }

    @SerializedName("type")
    private   String type;
    @SerializedName("price")
    private   double price;
    @SerializedName("participants")
    private  int participants;
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }
}
