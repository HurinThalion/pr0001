package eserciziPack3.giocoCarte;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GiocoCarteMetodi {

    private static List<String> carte = Arrays.asList("asso", "whatever1", "whatever2");
    private static int cont = 0;

    private static void mischiaCarte() {

        Collections.shuffle(carte);
    }

    public static List<String> getCarte() {

        return carte;
    }

    public static void scegli() {

        mischiaCarte();
        System.out.println("\nHo mescolato le carte");

        System.out.println("\nScrivi un numero da 0 a 2, " +
                "\nse trovi l'asso in quella posizione vinci");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        termina(str);
        if(controllaInput(str)) {
            System.out.println("\nhai inserito una posizione valida!");
            if(check(Integer.parseInt(str.trim()))) {
                System.out.println("\nHai trovato l' asso");
                System.out.println("\nQuesta era la disposizione delle 3 carte : ");
                int i = 0;
                for(String g : carte) {
                    System.out.print("(posizione "+ i + " : " + g + ")\t\t");
                    i++;
                }
                System.out.println("\n\nriprova, exit per uscire!");
                cont = 0;
                scegli();
            }else {
                cont++;
                if(cont < 10) {
                    System.out.println("\nnon hai indovinato, riprova; exit per uscire");
                    System.out.println("\nhai ancora : " + (10 - cont) + " " +
                            "tentativi per sbagliare");
                    scegli();
                }else {
                    System.out.println("\nHai fatto 10 tentativi, ora basta!");
                    termina("exit");
                }
            }
        }else {
            cont++;
            System.out.println("\nLa posizione inserita non è valida, riprova");
            System.out.println("\nhai ancora : " + (10 - cont) + " tentativi per sbagliare");
            if(cont < 10)
                scegli();
            else {
                System.out.println("\nHai fatto 10 tentativi, ora basta!");
                termina("exit");
            }
        }
    }

    private static boolean controllaInput(String s) {

        if(s.trim().equalsIgnoreCase("0") ||
                s.trim().equalsIgnoreCase("1") ||
                s.trim().equalsIgnoreCase("2")) {
            return true;
        } else {
            return false;
        }
    }

    private static void termina(String s) {

        if(s.trim().equalsIgnoreCase("exit")) {
            System.out.println("\nProgramma terminato");
            System.out.println("Queste erano le posizioni : ");
            int i = 0;
            for(String g : carte) {
                System.out.print("(posizione "+ i + " : " + g + ")\t\t");
                i++;
            }
            System.exit(10);
        }
    }

    private static boolean check(int z) {

        return carte.get(z).equalsIgnoreCase("asso");
    }
}
