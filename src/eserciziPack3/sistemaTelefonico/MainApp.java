package eserciziPack3.sistemaTelefonico;

import java.util.Random;

public class MainApp {

    public static void main(String[] args) {

        SimCard sim = SimCard.getSimCard(25);

        Random r = new Random();


        for(int i = 0; i < 100; i++) {
            int t = 2 + r.nextInt(3);
            sim.insertPhoneCall(t, GenPhoneNumber.generaNumeroTel());
        }

        System.out.println(sim.stampa());
    }
}
