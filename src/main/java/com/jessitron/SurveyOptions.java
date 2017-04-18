package com.jessitron;

public class SurveyOptions {
    
    private int seed;

    public SurveyOptions(int seed) {
        this.seed = seed;
    }

    public int getSeed () {
        return seed;
    }

    public void setSeed (int seed) {
        this.seed = seed;
    }

    // don't forget the default constructor. Jackson likes it
    public SurveyOptions () {}
}
