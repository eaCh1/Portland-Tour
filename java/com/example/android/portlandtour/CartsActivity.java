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

public class CartsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_list);

        //Create a list of places
        final ArrayList<Detail> details = new ArrayList<Detail>();

        // Add a detail to the list
        details.add(new Detail("Tight Tacos", "935 SE Cesar E Chavez Blvd", R.string.tt_tagline));
        details.add(new Detail("Bombay Chaat House", "804 SW 12th Ave", R.string.bch_tagline));
        details.add(new Detail("Kim Jong Grillin", "SE Division and 46th", R.string.kjg_tagline));
        details.add(new Detail("Fernando\'s Alegria", "7238 SE Foster Road", R.string.alegria_tagline));
        details.add(new Detail("Potato Champion", "1207 SE Hawthorne Blvd", R.string.poch_tagline));
        details.add(new Detail("Zenbu", "7909 SE 13th Ave", R.string.zenbu_tagline));
        details.add(new Detail("Savor Soup House", "1003 SW Alder St", R.string.ssh_tagline));


        //Applies the correct category color
        DetailAdapter adapter =
                new DetailAdapter(this, details, R.color.category_carts);

        ListView listView = (ListView) findViewById(R.id.detail_list);

        listView.setAdapter(adapter);


    }

    ;

}