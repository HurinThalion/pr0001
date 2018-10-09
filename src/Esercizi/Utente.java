//java bin, classe con dei costrutti particolari..tipo getter setter
//così si sa come è fatta a priori e si sa come usarla

package Esercizi;


public class Utente {

    String nome;
    int anni;

    {
        System.out.println("Sto per creare un utente");
    }

    static String code;
    static {
        System.out.println("Sto per creare un utente1");
        code = "094847";
    }


    public Utente(String nome, int anni) {
        this.nome = nome;
        this.anni = anni;
    }
}
