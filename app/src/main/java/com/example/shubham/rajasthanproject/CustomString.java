package com.example.shubham.rajasthanproject;

/**
 * Created by ritam on 20/3/18.
 */
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import java.text.DecimalFormat;


public class CustomString {
    private String name;
    private String address;
    private String phone;
    private Double clean_water;
    private Double normal_water;

    CustomString(String name, String address, String phone,Double clean_water,Double normal_water){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.clean_water = clean_water;
        this.normal_water = normal_water;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public Double getMagnitudeOfCleanWater(){
        return clean_water;
    }

    public Double getMagnitudeOFNormalWater(){
        return normal_water;
    }


}
