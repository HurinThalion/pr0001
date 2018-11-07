package eserciziPack.esercizi;

import java.util.Scanner;

public class Struttura {
    public static void main(String[] args) {

        //primo caso
        System.out.println("quante stringhe vuoi inserire?");
        Scanner n = new Scanner(System.in);
        int l = n.nextInt();
        System.out.println("Inserisci le stringhe : ");
        String str = "";
        String[] arrs = new String[l];
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < arrs.length; i++) {
            str = s.nextLine();
            arrs[i] = str;
        }
        for(String i : arrs) {
            System.out.print(i + "\t");
        }
        System.out.println("");

        //secondo caso
        System.out.println("quanti numeri vuoi inserire?");
        Scanner n1 = new Scanner(System.in);
        int l1 = n1.nextInt();
        System.out.println("Inserisci i numeri : ");
        int x = 0;
        int[] arri = new int[l1];
        Scanner s1 = new Scanner(System.in);
        for(int i = 0; i < arri.length; i++) {
            x = s1.nextInt();
            arri[i] = x;
        }
        for(int i : arri) {
            System.out.print(i + "\t");
        }
        System.out.println("");

        //terzo caso
        System.out.println(fib(6));
    }

    public static int fib(int x) {
        if((x == 1) || (x == 2))
            return 1;
        if(x > 2) {
            return fib((x - 2)) + fib((x - 1));
        }
        return -1;
    }
}
