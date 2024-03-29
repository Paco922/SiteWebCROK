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

    public static Date lireDate() {
        Scanner scanner = new Scanner(System.in);
        int jour = scanner.nextInt();
        int mois = scanner.nextInt();
        int annee = scanner.nextInt();

        scanner.close();

        return new Date(jour,mois,annee);
    }
 /** compareTo compare l'obje appelant (this) avec parDate
     * @return 0  si elles sont égales
     *         1 si this est plus grande que parDate
     *         -1 si this est plus petite que parDate
     */
    public int compareTo(Date parDate) {
        if (this.chAnnee > parDate.chAnnee) {
            return 1;
        }
        if (this.chAnnee < parDate.chAnnee) {
            return -1;
        }
        if (this.chMois > parDate.chMois) {
                return 1;
            }
        if (this.chMois < parDate.chMois) {
                return -1;
            }
        if (this.chJour > parDate.chJour) {
                return 1;
            }
        if (this.chJour < parDate.chJour)
                    return -1;

        return 0;



        }

    public Date dateDuLendemain(){
        if (chJour < Date.dernierJourMois(chMois, chAnnee))
            return new Date(chJour+1, chMois, chAnnee);
        else if (chMois == 12)
            return new Date(1,1,chAnnee+1);
        return new Date(1, chMois+1, chAnnee);
    }

    /** dateDeLaVeille renvoie la date de la veille de l'objet appelant
     *
     * @return Date
     */
    public Date dateDeLaVeille(){
        if (chJour == 1) {
            if (chMois == 1)
                return new Date(31, 12, chAnnee - 1);
            return new Date(Date.dernierJourMois(chMois - 1, chAnnee), chMois - 1, chAnnee);
        }
        return new Date(chJour-1,chMois, chAnnee);
    }
    public String toString() {
        return chJour + "/" + chMois + "/" + chAnnee;
    }

    

}
