package com.willi_vstn.vaccines_app;

public class VaccineModel {

    private final String title;
    private final int image;

    public VaccineModel(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }
}
