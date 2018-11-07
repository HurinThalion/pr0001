package eserciziPack.esercizi8;

import java.util.Random;

public class RandomTel {

    private static Random r = new Random();

    public static String generaNumTel() {

        int k = 0;
        String s1 = "+39 ";
        String s2 = "";
        String s = "";

        for(int i = 0; i < 9; i++) {
            k = r.nextInt(10);
            s2 += k;
        }

        if(s2.charAt(s2.length() - 1) % 2 == 0) {
            s = s1 + s2;
        }else
            s = s2;

        return s;
    }

    public static String generaNomePersona() {

        int j = 0;
        String nome = "";

        for (int i = 0; i < (3 + r.nextInt(20)); i++) {
            j = (97 + r.nextInt(26));
            nome += (char) j;
        }

        return nome;
    }




    public static void main(String[] args) {

        System.out.println(RandomTel.generaNumTel());
        System.out.println(RandomTel.generaNomePersona());
    }
}
