//Fatto Bene è quello giusto

package eserciziPack2.ricorsione;


import static metodiUtili.LeggiDaTastiera.leggiStringa;
import static metodiUtili.ParseInteri.parseIntero;

public class SeIntero {
    public static void main(String[] args) {

        String s = leggiStringa();;
        int l = parseIntero(s);
        System.out.println(l);
    }
}
