package com.jessitron;

public class SurveyOption {

    public SurveyOption() {}

    private String imageLocation;
    private String text;
    private int place;

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public String getText() {
        return text;
    }

    public SurveyOption(String imageLocation, String text) {
        this.imageLocation = imageLocation;
        this.text = text;
        this.place = 0;
    }

    public SurveyOption withPlace(int place) {
        SurveyOption copy = new SurveyOption(this.imageLocation, this.text);
        copy.setPlace(place);
        return copy;
    }

    @Override
    public String toString() {
        return "SurveyOption{" +
                "imageLocation='" + imageLocation + '\'' +
                ", text='" + text + '\'' +
                ", place=" + place +
                '}';
    }
}
