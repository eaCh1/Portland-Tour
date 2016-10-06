package com.example.android.portlandtour;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailAdapter extends ArrayAdapter<Detail> {

    private int mColorResourceId;

    public DetailAdapter(Activity context, ArrayList<Detail> words, int colorResourceId) {

        super(context, 0, words);

        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Detail currentDetail = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView name= (TextView) listItemView.findViewById(R.id.name);
        // Get the version name from the current detail and
        // set this text on the name TextView
        name.setText(currentDetail.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView location = (TextView) listItemView.findViewById(R.id.location);
        // Get the version number from the current detail and
        // set this text on the number TextView
        location.setText(currentDetail.getLocation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView tagline = (TextView) listItemView.findViewById(R.id.tagline);
        // Get the version number from the current detail and
        // set this text on the number TextView
        tagline.setText(currentDetail.getTagline());

        //Finds applicable images

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_image);

        if (currentDetail.hasImage()) {
            imageView.setImageResource(currentDetail.getImageResourceId());

            imageView.setVisibility(View.VISIBLE);

        } else {
            imageView.setVisibility(View.GONE);
        }


        View textContainer = listItemView.findViewById(R.id.text_containter);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);


        return listItemView;
    }

}
