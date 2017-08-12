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
public class Hotels extends Fragment {


    public Hotels() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Eqbal_Inn), getString(R.string.Eqbal_Inn_description), R.drawable.eqball));
        places.add(new Place(getString(R.string.Hotel_Mohan_Continental), getString(R.string.Hotel_Mohan_Continental_description), R.drawable.mohan));
        places.add(new Place(getString(R.string.Patiala_Retreat), getString(R.string.Patiala_Retreat_description), R.drawable.patiala_retreat));
        places.add(new Place(getString(R.string.Harbans_Residency), getString(R.string.Harbans_Residency_description), R.drawable.harbans));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
