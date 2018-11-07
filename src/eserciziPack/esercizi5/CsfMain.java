package eserciziPack.esercizi5;


import java.util.Scanner;

public class CsfMain {

    public static void main(String[] args) {

        CartaSassoForbice carta = CartaSassoForbice.CARTA;
        CartaSassoForbice sasso = CartaSassoForbice.SASSO;
        CartaSassoForbice forbice = CartaSassoForbice.FORBICE;

        System.out.println("Carta : " + carta.getCode());
        System.out.println("Sasso : " + sasso.getCode());
        System.out.println("Forbice : " + forbice.getCode());

        int i = 0;
        int win = 0;
        int loose = 0;
        Scanner s = new Scanner(System.in);

        while(i < 5) {
            System.out.println("Scegli carta, sasso, forbice : ");
            int scelta = s.nextInt();
            int l = CartaSassoForbice.rgen();
            if(scelta == 0) {
                if(l == 1) {
                    win++;
                    System.out.println("1 punto a player");
                }
                if(l == 2) {
                    loose++;
                    System.out.println("1 punto a PC");
                }
                i++;
                continue;
            }
            if(scelta == 1) {
                if(l == 0) {
                    loose++;
                    System.out.println("1 punto a PC");
                }
                if(l == 2) {
                    win++;
                    System.out.println("1 punto a player");
                }
                i++;
                continue;
            }
            if(scelta == 2) {
                if(l == 0) {
                    win++;
                    System.out.println("1 punto a player");
                }
                if(l == 1) {
                    loose++;
                    System.out.println("1 punto a PC");
                }
                i++;
            }
        }

        if(win > loose) {
            System.out.println("Ha vinto Player");
        }else if(loose > win) {
            System.out.println("Ha vinto PC");
        }else {
            System.out.println("Pareggio");
        }
    }
}
