package com.anschaucorp.studies_musiccontrol.model;

public class MyFavorites {
    public void add (Audio audio) {
        if (audio.getClassification() >= 9){
            System.out.println(audio.getTitle() + " is TOP of the TOP!!!!!");
        } else {
            System.out.println(audio.getTitle() + "is climbing to the TOP!!!");
        }
    }
}
