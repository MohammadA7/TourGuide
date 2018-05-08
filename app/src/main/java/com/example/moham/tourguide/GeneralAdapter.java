package com.example.moham.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GeneralAdapter extends ListAdapter<General> {

    public GeneralAdapter(ArrayList<General> arrayList, Context context){
        this.arrayList = arrayList;
        this.context = context;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if(rowView == null) {
           rowView = LayoutInflater.from(context).inflate(R.layout.list_item_without_image, parent, false);
        }

        TextView textView = rowView.findViewById(R.id.description_text);
        textView.setText(""  + arrayList.get(position).description);

        TextView textView2 = rowView.findViewById(R.id.information_text);
        textView2.setText(""  + arrayList.get(position).information);

        return rowView;
    }
}
