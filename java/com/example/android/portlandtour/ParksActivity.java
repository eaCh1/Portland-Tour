package com.example.android.portlandtour;

import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by eachunn on 9/30/16.
 */

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_list);

        //Create a list of places
        final ArrayList<Detail> details = new ArrayList<Detail>();

        // Add a detail to the list

        details.add(new Detail("Mount Tabor Park", "SE 60th Ave & SE Salmon St", R.string.tabor_tagline));
        details.add(new Detail("Kenilworth Park", "SE 34th Ave and Holgate Blvd,", R.string.kenil_tagline));
        details.add(new Detail("Forest Park", "4099 NW Thurman St Portland", R.string.forrest_tagline));
        details.add(new Detail("Laurelhurst Park", "SE Cesar E Chavez Blvd & Stark St", R.string.laurel_tagline));
        details.add(new Detail("Mills Ends Park", "SW Taylor St & SW Naito Pkwy, ", R.string.millends_tagline));
        details.add(new Detail("International Rose Test Garden", " 400 SW Rose Park Rd", R.string.rosegarden_tagline));
        details.add(new Detail("Skidmore Bluffs", "2230 N Skidmore Ct", R.string.skid_tagline));


        //Applies the correct category color
        DetailAdapter adapter =
                new DetailAdapter(this, details, R.color.category_parks);

        ListView listView = (ListView) findViewById(R.id.detail_list);

        listView.setAdapter(adapter);


    };

}