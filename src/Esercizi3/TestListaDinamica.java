package Esercizi3;

import Esercizi2.ListaDinamica;

import java.util.Scanner;

import static Ricorsione.Fib.fibonacci;
import static Ricorsione.Fib.registraFib;

public class TestListaDinamica {
    public static void main(String[] args) {

        ListaDinamica ld = new ListaDinamica();
        ld.add("ciao");
        ld.add("sono");
        ld.add("federico");
        System.out.println("Array attuale stringhe : ");
        ld.stampaContenuto();
        System.out.println("Array rovesciato stringhe: ");
        ld.stampaContenutoRovesciato();

        ld.add(32);
        ld.add(15);
        ld.add(17);
        ld.add(23);
        System.out.println("Array attuale int : ");
        ld.stampaContenutoInt();
        System.out.println("Array rovesciato int : ");
        ld.stampaContenutoRovesciatoInt();

        int x = fibonacci(8);
        System.out.println("Fibonacci fino all'ottava posizione : ");
        System.out.println(x);

        Scanner s = new Scanner(System.in);
        System.out.println("scegli quanti numeri di fib stampare : ");
        int d = s.nextInt();
        int[] arr = new int[d];
        System.out.println("eccoti la lista : ");
        registraFib(arr);
        for(int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println("");
        System.out.println("questa è la somma : ");
        int somma = 0;
        for(int j : arr) {
            somma = somma + j;
        }
        System.out.println(somma);

        ListaDinamica ld1 = new ListaDinamica();
        ld1.addPlus("ciao");
        ld1.addPlus("sono");
        ld1.addPlus("federico");
        System.out.println("Array attuale stringhe : ");
        ld1.stampaContenuto();

        double media;
        media = ld.mediaTemp(ld.getMm());
        System.out.println("media temp : ");
        System.out.println(media);



    }
}
