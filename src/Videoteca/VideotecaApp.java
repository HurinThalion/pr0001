package Videoteca;

public class VideotecaApp {

    public static void main(String[] args) {

        UtenteVideoteca u = new UtenteVideoteca("Mario Rossi");
        UtenteVideoteca ut = new UtenteVideoteca("Dario Rossi");
        Prodotti p1 = new Prodotti("Hateful Eight", 100);
        Prodotti p2 = new Prodotti("Django", 10);
        Prodotti p3 = new Prodotti("Inglorious Bastards", 0);

        //System.out.println(p1.getDisponibilita());
        //System.out.println(p2.getDisponibilita());
        //System.out.println(p2.getDisponibilita());
        //System.out.println(p3.getDisponibilita());

        System.out.println(u.getNome() + " prende i suoi film");
        u.addProdottiNoleggiati(p1);
        u.addProdottiNoleggiati(p2);
        u.addProdottiNoleggiati(p3);


        for(Prodotti pr : u.getProdottiNoleggiati()) {
            System.out.println(pr);
        }

        System.out.println(ut.getNome() + " prende i suoi film");

        ut.addProdottiNoleggiati(p2);
        for(Prodotti pr : ut.getProdottiNoleggiati()) {
            System.out.println(pr);
        }
    }
}
