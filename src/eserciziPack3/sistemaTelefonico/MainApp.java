package eserciziPack3.sistemaTelefonico;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {


        SimCard s = SimCard.getSimCard(25);
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        s.insertPhoneCall(t);
    }
}
