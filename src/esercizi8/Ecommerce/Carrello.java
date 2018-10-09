package esercizi8.Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Carrello {

    private static List<Prodotto> lista = new ArrayList<>();
    private static Carrello c = null;

    private Carrello() {}

    public static Carrello getCarrello() {
        if(c == null)
            return new Carrello();
        else
            return c;
    }

    public static void addProdotto(Prodotto p) {
        lista.add(p);
        p.setDisponibilita(1);
    }

    public static boolean removeProdotto(Prodotto p) {
        if(lista.remove(p)) {
            p.setDisponibilita(-1);
            return true;
        }else {
            return false;
        }
    }

    public static void stampaCarrello() {
        for(Prodotto p : Carrello.lista) {
            System.out.println(p);
        }
    }
}
