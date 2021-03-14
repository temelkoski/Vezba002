package com.company;

public class CrtanFilm {

    public class CrtanFilm extends Movie{

        void gledanECrtaniot(){
            if (daliEgledan==true)
                System.out.println("Crtaniot e gledan.");
            else { daliEgledan=true;
                System.out.println("Go gledame crtaniot.");

            }
        }
        void showAdd(){
            System.out.println("Ovoj crtan e "+dolzhina+" "+zharn);
            if (daliEgledan==true)
                System.out.println("Crtaniot e izgledan.");
            else System.out.println("Crtaniot ne e gledan");
        }
}
