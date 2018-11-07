package eserciziPack.esercizi;

import java.util.Scanner;

public class TestEsercizi {
    public static void main(String args[]) {
        /*Punto p = new Punto(2, 7);
        System.out.println(p.getX());
        System.out.println(p.getY());

        String s = "Federico";
        String c = "r";

        String s1 = rimuoviCarattere(c, s);

        System.out.println(s);
        System.out.println(s1);*/

        /*for(char c = 'a'; c <= 'z'; c++) {
            System.out.println((char)c
                    + "\t" + (char) valida(++c)
                    + "\t" + (char) valida(++c));
        }*/
        System.out.println("scrivi numero colonne :");
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        stampaInColonna(l);

        Utente u = new Utente("pippo", 23);
    }
    //con string non toglie il carattere
    public static String rimuoviCarattere(String carattere, String parola) {
        String out = "";
        for(int i = 0; i < parola.length(); i++) {
            if(!(carattere.equals(parola.charAt(i)))) {
                out += parola.charAt(i);
            }
        }
        return out;
    }



    public static char valida(char c) {
        return (c >= 'a' && c <= 'z' ? c : '\u0000');
    }


    public static void stampaInColonna(int i) {
        for(char c = 'a'; c <= 'z'; c++) {
            for(int k = 1; k <= i; k++) {
                System.out.print("\t" + (char) valida(c++));
            }
            c--;
            System.out.println("");
        }
    }


}
