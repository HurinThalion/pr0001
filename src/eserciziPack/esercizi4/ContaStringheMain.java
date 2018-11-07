package eserciziPack.esercizi4;

import metodiUtili.LeggiDaTastiera;

public class ContaStringheMain {

    public static void main(String[] args) {

        String s = LeggiDaTastiera.leggiStringa();
        System.out.println(ContaInStringa.contaParole(s));
    }
}
