package Esercizi4;

import MetodiUtili.LeggiDaTastiera;

public class ContaStringheMain {

    public static void main(String[] args) {

        String s = LeggiDaTastiera.leggiStringa();
        System.out.println(ContaInStringa.contaParole(s));
    }
}
