package eserciziPack.esercizi4;

import java.util.Scanner;

public class Scelte {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner f = new Scanner(System.in);

        System.out.println("Scegli un'operazione : ");
        System.out.println("Premi 1 per : somma");
        System.out.println("Premi 2 per : sottrazione");
        System.out.println("Premi 3 per : moltiplicazione");
        System.out.println("Premi 4 per : divisione");
        System.out.println("Premi 9 per temrinare : ");

        String str;
        int parse = 0;
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;

        do {
            System.out.println("Let's go : ");
            str = s.next();
            try{
                parse = Integer.parseInt(str);
            }catch (NumberFormatException n) {
                System.out.println("Inserisci un numero da 1 a 4 pls!");
                continue;
            }

            if(parse == 1) {
                System.out.println("hai scelto somma, metti un numero : ");
                String c = f.next();
                int k;
                try{
                    k = Integer.parseInt(c);
                }catch (NumberFormatException n) {
                    System.out.println("Torna alla scelta -> Inserisci un numero valido!");
                    continue;
                }
                r1 = somma(k, 0);
                System.out.println("Ecco il risultato : " + r1);
            }

        }while(parse != 9);



    }

    public static int somma(int x, int r) {
        if(x == 0)
            return r;
        if(x > 0)
            r = r + x;
            return somma(x - 1, r);
    }
}
