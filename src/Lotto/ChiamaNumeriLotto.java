package Lotto;

import java.util.Random;

public class ChiamaNumeriLotto {

    private static Random r = new Random();

    public static int chiamaNumero() {
        int n = 0;
        n= r.nextInt(91);
        return n;
    }

    public static void gioco(int[] numeri1, int[] numeri2, int[] numeri3, int[] numeri4,
                             GiocatoreLotto g1, GiocatoreLotto g2, GiocatoreLotto g3,
                             GiocatoreLotto g4) {

        g1.setPortafoglio(10);
        g2.setPortafoglio(10);
        g3.setPortafoglio(10);
        g4.setPortafoglio(10);
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;

        int k = 0;

        int[] tmp = new int[6];
        int[] tmp1 = new int[6];
        int[] tmp2 = new int[6];
        int[] tmp3 = new int[6];

        do {
            k = ChiamaNumeriLotto.chiamaNumero();

            for(int l = 0; l < 15; l++) {
                if((k == numeri1[l]) & i < 6) {
                    tmp[i] = k;
                    i++;
                    numeri1[l] = -1;
                }
            }
            if(i == 6)
                break;

            for(int l = 0; l < 15; l++) {
                if((k == numeri2[l]) & i1 < 6) {
                    tmp1[i1] = k;
                    i1++;
                    numeri2[l] = -1;
                }
            }
            if(i1 == 6)
                break;

            for(int l = 0; l < 15; l++) {
                if((k == numeri3[l]) & i2 < 6) {
                    tmp2[i2] = k;
                    i2++;
                    numeri3[l] = -1;
                }
            }
            if(i2 == 6)
                break;

            for(int l = 0; l < 15; l++) {
                if((k == numeri4[l]) & i3 < 6) {
                    tmp3[i3] = k;
                    i3++;
                    numeri4[l] = -1;
                }
            }
            if(i3 == 6)
                break;
        }while(i < 6 || i1 < 6 || i2 < 6 || i3 < 6);

        System.out.println("sestina con questi numeri : ");

        for (int j = 0; j < 6 ; j++) {
            System.out.print(tmp[j] + "\t");
        }
        System.out.println("");

        for (int j = 0; j < 6 ; j++) {
            System.out.print(tmp1[j] + "\t");
        }
        System.out.println("");

        for (int j = 0; j < 6 ; j++) {
            System.out.print(tmp2[j] + "\t");
        }
        System.out.println("");

        for (int j = 0; j < 6 ; j++) {
            System.out.print(tmp3[j] + "\t");
        }
        System.out.println("");


        if(tmp[tmp.length - 1] != 0) {
            System.out.println("Vinto Player1!!");
            g1.setVincita();
        }
        else if(tmp[tmp.length - 2] != 0)
                System.out.println("Cinquina Player1!!");
        else if(tmp[tmp.length - 3] != 0)
                System.out.println("Quaterna Player1!!");

        if(tmp1[tmp1.length - 1] != 0) {
            System.out.println("Vinto Player2!!");
            g2.setVincita();
        }
        else if(tmp1[tmp1.length - 2] != 0)
                System.out.println("Cinquina Player2!!");
        else if(tmp1[tmp1.length - 3] != 0)
                System.out.println("Quaterna Player2!!");

        if(tmp2[tmp2.length - 1] != 0) {
            System.out.println("Vinto Player3!!");
            g3.setVincita();
        }
        else if(tmp2[tmp2.length - 2] != 0)
            System.out.println("Cinquina Player3!!");
        else if(tmp2[tmp2.length - 3] != 0)
            System.out.println("Quaterna Player3!!");

        if(tmp3[tmp3.length - 1] != 0) {
            System.out.println("Vinto Player4!!");
            g4.setVincita();
        }
        else if(tmp3[tmp3.length - 2] != 0)
            System.out.println("Cinquina Player4!!");
        else if(tmp3[tmp3.length - 3] != 0)
            System.out.println("Quaterna Player4!!");

    }
}
