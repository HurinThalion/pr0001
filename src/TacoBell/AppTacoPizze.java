package TacoBell;

import java.util.Scanner;

public class AppTacoPizze {

    public static void main(String[] args) {

        TacoPizze.addFoodname();
        TacoPizze.addAdjective();
        TacoPizze.addPostfix();

        System.out.println("Genera pizze casuali, \" si \" per generare, \" stop \" per terminare");
        Scanner s = new Scanner(System.in);
        String c = "";
        do {
            c = s.nextLine();
            if(c.equalsIgnoreCase("si"))
                TacoPizze.genera(1);
            else {
                if(!c.equalsIgnoreCase("stop"))
                    System.out.println("Scrivi giusto!!");
            }
        }while(!c.equalsIgnoreCase("stop"));

        System.out.println("adesso genero io un pò di pizze : ");
        TacoPizze.genera();

        System.out.println("Genera pizze casuali, \" si \" per generare, \" stop \" per terminare e \" agginta \" per aggiungere contorno");
        Scanner s1 = new Scanner(System.in);
        String c1 = "";
        String c2 = "";
        do {
            c1 = s1.nextLine();
            if(c1.equalsIgnoreCase("si")) {
                c2 = s1.nextLine();
                //if(c1.equalsIgnoreCase("si"))
                    TacoPizze.genera(1, c2);
            } else {
                if(!c1.equalsIgnoreCase("stop"))
                    System.out.println("Scrivi giusto!");
            }
        }while(!c1.equalsIgnoreCase("stop"));

        System.out.println(TacoPizze.generaESalva());

        System.out.println("Genera e salva :");
        Scanner ss = new Scanner(System.in);
        String cc1 = "";
        String cc2 = "";
        do {
            cc1 = ss.nextLine();
            if(cc1.equalsIgnoreCase("si")) {
                cc2 = ss.nextLine();
                //if(c1.equalsIgnoreCase("si"))
                System.out.println(TacoPizze.generaESalva(cc2));
            } else {
                if(!cc1.equalsIgnoreCase("stop"))
                    System.out.println("Scrivi giusto!");
            }
        }while(!cc1.equalsIgnoreCase("stop"));

        System.out.println(TacoPizze.getStr() + " }");
    }
}
