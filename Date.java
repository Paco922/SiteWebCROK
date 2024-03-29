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

    public static int dernierJourMois(int parMois, int parAnnee) {
        if ( parMois > 12) { return 0;}
        if (parMois < 1) { return 0;}
        switch (parMois) {
            case 2:
                if (Date.estBissextile(parAnnee)) {
                    return 29;
            }
                return 28;
            case 4 : case 6: case 9: case 11:
                return 30;

        default:
            return 31;
        }
    }

    
}
