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
public class Attractions extends Fragment {


    public Attractions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.gurdwara_sahib),getString(R.string.gurdwara_sahib_description),R.drawable.gurudwara_sahib));
        places.add(new Place(getString(R.string.baradari_garden),getString(R.string.baradari_garden_description),R.drawable.bardari));
        places.add(new Place(getString(R.string.moti_bagh_palace),getString(R.string.moti_bagh_palace_description),R.drawable.moti_bagh_palace));
        places.add(new Place(getString(R.string.qila_mubarak),getString(R.string.qila_mubarak_description),R.drawable.qila));
        places.add(new Place(getString(R.string.Kali_Mata_Mandir),getString(R.string.Kali_Mata_Mandir_description),R.drawable.mandir));
        places.add(new Place(getString(R.string.Gurdwara_Sahib_Moti_Bagh),getString(R.string.Gurdwara_Sahib_Moti_Bagh_description),R.drawable.moti_bagh));
        places.add(new Place(getString(R.string.Dhillon_Fun_World),getString(R.string.Dhillon_Fun_World_description),R.drawable.fun_world));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
