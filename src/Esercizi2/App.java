package Esercizi2;

public class App {

    public static void main(String[] args) {

        ListaDinamica ld = new ListaDinamica();
        ld.add("11");
        ld.add("22");
        ld.add("33");
        ld.add("444");
        ld.add("555");

        //int k = lunghezzaArray(ld.getDb());
        ld.stampaContenuto();

    }
}
