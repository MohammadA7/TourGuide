package com.example.moham.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {


    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        ListView listView = view.findViewById(R.id.list_view);


        ArrayList<General> arrayList = new ArrayList<>();
        arrayList.add(new General("Dress Code", "The Saudi men wear a traditional dress called the thobe, " +
                "and it is the law in Saudi Arabia for expat women to wear an abaya when they are out in public "));

        arrayList.add(new General("Alcohol", "It is illegal to produce it, import it, or consume it. Saudi Arabia is a Muslim country where there is a strict interpretation of the Koran."));


        listView.setAdapter(new GeneralAdapter(arrayList, this.getContext()));
        return view;
    }

}
