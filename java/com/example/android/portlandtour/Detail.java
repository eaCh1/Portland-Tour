package com.example.android.portlandtour;

/**
 * Created by eachunn on 10/1/16.
 */

public class Detail {

    //Initializing the variable empty
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mName;
    private String mLocation;
    private int mTagline;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public Detail(String name, String location, int taglineResourceId) {
        mName = name;
        mLocation = location;
        mTagline = taglineResourceId;
    }

    //For lists with images
    public Detail(String name, String location, int taglineResourceId, int imageResourceId) {
        mName = name;
        mLocation = location;
        mTagline = taglineResourceId;
        mImageResourceId = imageResourceId;
    }

    //Get the the name of the place
    public String getName() {
        return mName;
    }

    //Get the location of the place
    public String getLocation() {
        return mLocation;
    }

    //Get the tagline of the place
    public int getTagline() {
        return mTagline;
    }

    //Checks Detail object for an available image resource to display
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    //Get image for place, if available
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
