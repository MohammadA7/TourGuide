package com.example.moham.tourguide;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ListAdapter<Places> {

    public PlacesAdapter(ArrayList<Places> arrayList, Context context){
        this.arrayList = arrayList;
        this.context = context;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if(rowView == null) {
           rowView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }
        ImageView imageView = rowView.findViewById(R.id.imageView);
        imageView.setImageResource(arrayList.get(position).imageResourcesId);

        TextView textView = rowView.findViewById(R.id.description_text);
        textView.setText(""  + arrayList.get(position).description);

        TextView textView2 = rowView.findViewById(R.id.information_text);
        textView2.setText(""  + arrayList.get(position).information);

        return rowView;
    }
}
