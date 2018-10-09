package Esercizi7.OpzionaleMultimediale;


import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        Filmato f = new Filmato("Clip", 3, 10, 10);
        Audio a = new Audio("Sonoro", 2, 7);
        Immagine i = new Immagine("Photo", 5);

        /*System.out.println(f.play());
        System.out.println(a.play());
        System.out.println(i.show());

        f.darker();
        f.darker();
        a.louder();
        a.louder();
        i.brighter();
        i.brighter();

        System.out.println(f.play());
        System.out.println(a.play());
        System.out.println(i.show());*/
        Scanner s = new Scanner(System.in);
        Scanner u = new Scanner(System.in);
        int l = 0;
        String o = "";
        do {
            System.out.println("scrivi da 1 a 3 per eseguire : ");
            l = s.nextInt();
            if(l == 1) {
                System.out.println(f.play());
            }
            if(l == 2) {
                System.out.println(a.play());
            }
            if(l == 3) {
                System.out.println(i.show());
            }
        }while(l != 0);

    }
}
