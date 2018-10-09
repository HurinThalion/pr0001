//Fatto Bene è quello giusto

package Ricorsione;


import static MetodiUtili.LeggiDaTastiera.leggiStringa;
import static MetodiUtili.ParseInteri.parseIntero;

public class SeIntero {
    public static void main(String[] args) {

        String s = leggiStringa();;
        int l = parseIntero(s);
        System.out.println(l);
    }
}
