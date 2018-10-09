package Esercizi7.OpzionaleMultimediale;

public abstract class ElementoMultimediale {

    private String titolo = "titolo di default";

    public ElementoMultimediale(String titolo) {
        setTitolo(titolo);
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if(!titolo.equalsIgnoreCase(""))
            this.titolo = titolo;
        else {
            System.out.println("Inserire un titolo valido!");
            System.out.println("Titolo attuale : " + this.titolo);
        }
    }
}
