package MetodiUtili;

import java.util.Scanner;

public class LeggiDaTastiera {

    public static String leggiStringa() {
        Scanner s = new Scanner(System.in);
        System.out.println("Scrivi una stringa : ");
        return s.nextLine();
    }
}
