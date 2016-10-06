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

public class FlicksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_list);

        //Create a list of places
        final ArrayList<Detail> details = new ArrayList<Detail>();

        // Add a detail to the list
        details.add(new Detail("Hollywood Theatre", "4122 NE Sandy Boulevard", R.string.hollywood_tagline));
        details.add(new Detail("Laurelhurst Theater", "2735 East Burnside Street", R.string.laurelhurst_tagline));
        details.add(new Detail("Clinton Street Theater", "2522 SE Clinton Street", R.string.clinton_tagline));
        details.add(new Detail("Living Room Theaters", "341 SW 10th Avenue", R.string.livingroom_tagline));
        details.add(new Detail("Bagdad Theatre", "3702 SE Hawthorne Boulevard", R.string.bagdad_tagline));
        details.add(new Detail("Cinemagic Theatre", "2021 SE Hawthorne Boulevard", R.string.laurelhurst_tagline));
        details.add(new Detail("Mission Theater", "1624 NW Glisan Street", R.string.laurelhurst_tagline));


        //Applies the correct category color
        DetailAdapter adapter =
                new DetailAdapter(this, details, R.color.category_flicks);

        ListView listView = (ListView) findViewById(R.id.detail_list);

        listView.setAdapter(adapter);


    }

    ;

}