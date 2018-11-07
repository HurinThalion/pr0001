package eserciziPack.esercizi5;

import java.util.Random;

public class Cifratore {

    private static Cifratore c = null;
    private static int chiave;
    private Random r = new Random(); //useremo un suo metodo per scegliere boolean casuale

    private Cifratore() {
        String parola = "abc";
        for(int i = 0; i < parola.length(); i++) {
            chiave += parola.charAt(i);
        }
        if(r.nextBoolean()) {
            chiave = -(chiave);
        }
        //System.out.println("IL valore della chiave (che useremo per shiftare) è : " + chiave);
    }

    public static synchronized Cifratore getCifratore() {
        if(c == null)
            c = new Cifratore();
        return c;
    }

    public int getChiave() {
        return chiave;
    }

    public String cifraParola(String parola) {

        String tmp = "";
        for(int i = 0; i < parola.length(); i++) {
            tmp += (char) (parola.charAt(i) + chiave);
        }

        return tmp;
    }

    public String decifraParola(String parolaCifrata) {

        String tmp = "";
        for(int i = 0; i < parolaCifrata.length(); i++) {
            tmp += (char) (parolaCifrata.charAt(i) - chiave);
        }

        return tmp;
    }
}
