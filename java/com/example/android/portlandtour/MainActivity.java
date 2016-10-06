/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.portlandtour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.portlandtour.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView carts = (TextView) findViewById(R.id.carts);

        // Set a click listener on that View
        if (carts != null) {
            carts.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent numbersIntent = new Intent(MainActivity.this, CartsActivity.class);
                    startActivity(numbersIntent);
                }
            });
        }

        // Find the View that shows the numbers category
        TextView flicks = (TextView) findViewById(R.id.flicks);

        // Set a click listener on that View
        if (flicks != null) {
            flicks.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent familyIntent = new Intent(MainActivity.this, FlicksActivity.class);
                    startActivity(familyIntent);
                }
            });
        }

        // Find the View that shows the numbers category
        TextView parks = (TextView) findViewById(R.id.parks);

        // Set a click listener on that View
        if (parks != null) {
            parks.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent colorsIntent = new Intent(MainActivity.this, ParksActivity.class);
                    startActivity(colorsIntent);
                }
            });
        }

        // Find the View that shows the numbers category
        TextView bridges = (TextView) findViewById(R.id.bridges);

        // Set a click listener on that View
        if (bridges != null) {
            bridges.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent phrasesIntent = new Intent(MainActivity.this, BridgesActivity.class);
                    startActivity(phrasesIntent);
                }
            });
        }


    }
}
