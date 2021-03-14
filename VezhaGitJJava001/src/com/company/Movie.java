package com.company;

public class Movie {

    String zharn;
    String dolzhina;
    boolean daliEgledan = false;

    void gledanEfilmot(){
        if (daliEgledan == true)
            System.out.println("Filmot e gledan.");
        else {
            daliEgledan = true;
            System.out.println("Go gledame filmot...");
        }
    }
    void showAtt(){
        System.out.println("Ovoj film e "+dolzhina+" "+zharn);
        if (daliEgledan == true)
            System.out.println("Filmot e izgledan.");
        else System.out.println("Filmot ne e gledan.");

    }
}
