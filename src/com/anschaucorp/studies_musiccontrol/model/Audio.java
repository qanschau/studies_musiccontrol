package com.anschaucorp.studies_musiccontrol.model;

public class Audio {
    private String title;
    private int totalTimesPlayed;
    private int sumOfLikes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalTimesPlayed() {
        return totalTimesPlayed;
    }

    public int getSumOfLikes() {
        return sumOfLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void like(){
        this.sumOfLikes++;
    }

    public void play(){
        this.totalTimesPlayed++;
    }
}
