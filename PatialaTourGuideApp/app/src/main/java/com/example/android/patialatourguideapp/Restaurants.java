package com.example.android.patialatourguideapp;


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
public class Restaurants extends Fragment {


    public Restaurants() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Jaggi_Sweets),getString(R.string.Jaggi_Sweets_description),R.drawable.jaggi));
        places.add(new Place(getString(R.string.Boston_Bites),getString(R.string.Boston_Bites_descritpion),R.drawable.boston));
        places.add(new Place(getString(R.string.F2G),getString(R.string.F2G_description),R.drawable.f2g));
        places.add(new Place(getString(R.string.The_Yellow_Chilli),getString(R.string.The_Yellow_Chilli_description),R.drawable.yellow));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
