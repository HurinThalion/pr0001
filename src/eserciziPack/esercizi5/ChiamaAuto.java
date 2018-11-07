package eserciziPack.esercizi5;

import java.util.Random;

public class ChiamaAuto {

    private static Random r = new Random();
    private static String[] modelloAuto = new String[] {"Ferrari", "Porsche",
            "Tesla", "Smart", "BMW", "Audi", "Volta", "Nextre",
            "Persona di colore", "A caso", "Simpatico"};

    public static String getModello() {
        return modelloAuto[r.nextInt(modelloAuto.length)];
    }
}
