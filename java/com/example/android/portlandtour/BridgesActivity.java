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

public class BridgesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_list);

        //Create a list of places
        final ArrayList<Detail> details = new ArrayList<Detail>();

        // Add a detail to the list
        details.add(new Detail("St. John's Bridge", "45°35′07″N 122°45′52″W",
                R.string.stjohns_tagline, R.drawable.stjohnsbridge));
        details.add(new Detail("Fremont Bridge", "45°32′16″N 122°40′59″W",
                R.string.fremont_tagline, R.drawable.fremont_bridge));
        details.add(new Detail("Broadway Bridge", "45°31′55″N 122°40′27″W",
                R.string.broadway_tagline, R.drawable.broadway_bridge));
        details.add(new Detail("Steel Bridge", "45°31′39″N 122°40′09″W",
                R.string.steel_tagline, R.drawable.steelbridge));
        details.add(new Detail("Burnside Bridge", "45°31′23″N 122°40′03″W",
                R.string.burnside_tagline, R.drawable.burnside_bridge));
        details.add(new Detail("Morrison Bridge", "45°31′04″N 122°40′11″W",
                R.string.morrison_tagline, R.drawable.morrison_bridge));
        details.add(new Detail("Hawthorne Bridge", "45°30′47″N 122°40′14″W",
                R.string.hawthorne_tagline, R.drawable.hawthorne_bridge));
        details.add(new Detail("Marquam Bridge", "45°30′29″N 122°40′09″W",
                R.string.marquam_tagline, R.drawable.marquam_bridge));
        details.add(new Detail("Tilikum Bridge", "45°30′20″N 122°39′54″W",
                R.string.tilikum_tagline, R.drawable.tilikum_crossing));
        details.add(new Detail("Ross Island Bridge", "45°30′04″N 122°39′52″W",
                R.string.rossisland_tagline, R.drawable.rossisland_bridge));
        details.add(new Detail("Sellwood Bridge", "45°27′52″N 122°39′56″W",
                R.string.sellwood_tagline, R.drawable.sellwoodbidge));

        //Applies the correct category color
        DetailAdapter adapter =
                new DetailAdapter(this, details, R.color.category_bridges);

        ListView listView = (ListView) findViewById(R.id.detail_list);

        listView.setAdapter(adapter);


    }

    ;

}

