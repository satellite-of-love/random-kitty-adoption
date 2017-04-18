package com.jessitron;

import java.util.List;

public class SurveyOptions {

    private String surveyName;
    private int seed;
    private List<SurveyOption> options;

    public SurveyOptions(String surveyName, int seed, List<SurveyOption> options) {
        this.surveyName = surveyName;
        this.seed = seed;
        this.options = options;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public List<SurveyOption> getOptions() {
        return options;
    }

    public void setOptions(List<SurveyOption> options) {
        this.options = options;
    }

    public String getSurveyName () {
        return surveyName;
    }

    public void setSurveyName (String surveyName) {
        this.surveyName = surveyName;
    }

    // don't forget the default constructor. Jackson likes it
    public SurveyOptions () {}
}
