package com.geekdroid.recyclerviewpost.model;

public class AndroidVersionModel {

    private String android_name;
    private String version_number;
    private String initial_release_date;
    private int aPI_level;

    public AndroidVersionModel(String android_name, String version_number, String initial_release_date, int aPI_level) {
        this.android_name = android_name;
        this.version_number = version_number;
        this.initial_release_date = initial_release_date;
        this.aPI_level = aPI_level;
    }

    public String getAndroid_name() {
        return android_name;
    }

    public void setAndroid_name(String android_name) {
        this.android_name = android_name;
    }

    public String getVersion_number() {
        return version_number;
    }

    public void setVersion_number(String version_number) {
        this.version_number = version_number;
    }

    public String getInitial_release_date() {
        return initial_release_date;
    }

    public void setInitial_release_date(String initial_release_date) {
        this.initial_release_date = initial_release_date;
    }

    public int getaPI_level() {
        return aPI_level;
    }

    public void setaPI_level(int aPI_level) {
        this.aPI_level = aPI_level;
    }
}
