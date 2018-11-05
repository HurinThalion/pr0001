package Esercizi2;

import static metodiUtili.LeggiStringa.leggiInt;

public class PassGeneretor {
    public static void main(String[] args) {

        System.out.println("Scrivi quanto vuoi lunga la password : ");
        int p = leggiInt();
        System.out.println("Ecco la password generata : ");
        int[] pass = new int[p];
        char[] passc = new char[p];

        for(int i = 0; i < pass.length; i++) {
            pass[i] = 97 + (int) (Math.random() * ((122 - 97) + 1));
            passc[i] = (char) pass[i];
            System.out.print(passc[i] + " ");
        }

        /*System.out.println("");
        for(char c : passc) {
            System.out.print(c + " ");
        }*/
    }
}
