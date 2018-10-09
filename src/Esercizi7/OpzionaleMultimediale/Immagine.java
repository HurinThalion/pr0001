package Esercizi7.OpzionaleMultimediale;

public class Immagine extends ElementoMultimediale implements InterfacciaNoRip, Luminosita {

    private int luminosita = 0;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        if(luminosita >= 0)
            this.luminosita = luminosita;
        else {
            System.out.println("impostare valori corretti");
            System.out.println("luminosita impostata di default");
        }
    }

    public String show() {

        String tmp = getTitolo();
        String lum = "";
        for(int s = 0; s < luminosita; s++) {
            lum += "*";
        }

        tmp += lum;
        return tmp;
    }

    @Override
    public void brighter() {
        luminosita++;
    }

    @Override
    public void darker() {
        if(luminosita > 0)
            luminosita--;
        else {
            System.out.println("Luminosita al minimo");
        }
    }
}
