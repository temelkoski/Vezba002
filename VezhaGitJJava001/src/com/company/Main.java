package com.company;

public class Main {

    public static void main(String[] args) {
        Movie film = new Movie();
        film.dolzhina = "dolgometrazhen";
        film.zharn = "triler";
        System.out.println("Vkluchuvame TV...");
        film.showAtt();
        System.out.println("----------------");
        System.out.println("Go ostavame filmot!");
        film.gledanEfilmot();
        System.out.println("----------------");
        System.out.println("Televizorot seushte e vkluchen na istiot kanal....!!!");
        film.showAtt();
        System.out.println("-----------------");
        System.out.println("Menuvame kanal na TV...");
        film.gledanEfilmot();


    }
}