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
public class FragmentTwo extends Fragment {

    ArrayList<Places> arrayList;

    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        ListView listView = view.findViewById(R.id.list_view);

        arrayList = new ArrayList<>();
        arrayList.add(new Places(R.drawable.almajlis , getString(R.string.restaurant_one_name), getString(R.string.restaurant_one_info)));
        arrayList.add(new Places(R.drawable.alromansiah , getString(R.string.restaurant_two_name), getString(R.string.restaurant_two_info)));

                listView.setAdapter(new PlacesAdapter(arrayList, this.getContext()));
        return view;
    }

}
