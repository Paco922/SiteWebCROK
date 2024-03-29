package com.example.tp5qdv;

import java.util.Scanner;
public class Date {
    private int chJour;
    private int chMois;
    private int chAnnee;

    public Date(int parJour, int parMois, int parAnnee){
        chJour = parJour;
        chMois = parMois;
        chAnnee = parAnnee;
    }
    

    private static boolean estBissextile(int parAnnee) {
        if (parAnnee % 400 == 0) {
            return true;
        }
        if (parAnnee % 4 == 0) {
            return parAnnee % 100 != 0;
        }
        return false;
    }


