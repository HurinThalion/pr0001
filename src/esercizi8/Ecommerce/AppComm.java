package esercizi8.Ecommerce;

public class AppComm {

    public static void main(String[] args) {

        Televisore tv = new Televisore();
        Televisore tv1 = new Televisore();
        Computer c = new Computer();
        Computer c1 = new Computer();
        System.out.println(tv);
        System.out.println("--------------");
        Carrello.getCarrello();
        Carrello.addProdotto(tv);
        Carrello.addProdotto(tv1);
        Carrello.addProdotto(c);
        Carrello.addProdotto(c1);
        Carrello.stampaCarrello();
        System.out.println("---------------");
        Carrello.removeProdotto(tv);
        Carrello.stampaCarrello();
        System.out.println("---------------");
        System.out.println(tv);
    }
}
