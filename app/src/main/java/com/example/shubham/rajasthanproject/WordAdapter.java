package com.example.shubham.rajasthanproject;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.shubham.rajasthanproject.CustomString;
import com.example.shubham.rajasthanproject.R;

import java.util.ArrayList;

/**
 * Created by Ritam Mallick on 02-01-2017.
 */

public class WordAdapter extends ArrayAdapter<CustomString> {

    public WordAdapter(Context context, ArrayList<CustomString> list){
        super(context,0,list);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.custom_list_view, parent, false);
        }

        CustomString str=getItem(position);
        TextView text1=(TextView)view.findViewById(R.id.name_of_head);
        text1.setText(str.getName());

        TextView text2=(TextView)view.findViewById(R.id.primary_location);
        text2.setText(str.getAddress());
        TextView text3 = (TextView)view.findViewById(R.id.clean_water);
        text3.setText(String.valueOf(str.getMagnitudeOfCleanWater()));
        TextView text4 = (TextView)view.findViewById(R.id.normal_water);
        text4.setText(String.valueOf(str.getMagnitudeOFNormalWater()));
        GradientDrawable circle=(GradientDrawable)text3.getBackground();
        circle.setColor(getContext().getResources().getColor(R.color.magnitude2));

        GradientDrawable circle1=(GradientDrawable)text4.getBackground();
        circle1.setColor(getContext().getResources().getColor(R.color.magnitude10plus));

        /*TextView text3=(TextView)view.findViewById(R.id.primary_location);
        text3.setText(str.getString(2));
        TextView text4=(TextView)view.findViewById(R.id.time);
        text4.setText(str.getString(3));
        TextView text5=(TextView)view.findViewById(R.id.date);
        text5.setText(str.getString(4));*/
        return view;
    }
}