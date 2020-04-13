package com.example.obidi.androidflavor;

import java.util.ArrayList;

/**
 * Created by USER on 10/15/2018.
 */
public class AndroidFlavor {
    private String name;
    private String version;
    private int imageResId;

    public AndroidFlavor(String name, String version, int imageResId) {
        this.name = name;
        this.version = version;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public int getImageResId() {
        return imageResId;
    }
}
