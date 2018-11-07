package eserciziPack.esercizi7.OpzionaleMultimediale;

public class Filmato extends Riproducibile implements Luminosita {

    private int luminosita = 0;

    public Filmato(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata, volume);
        if(luminosita >= 0)
            this.luminosita = luminosita;
        else {
            System.out.println("impostare valori corretti");
            System.out.println("luminosita impostata di default");
        }
    }

    public int getLuminosita() {
        return luminosita;
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

    @Override
    public String play() {
        String tmp = "";
        String vol = "";
        String lum = "";
        for(int i = 0; i < this.getDurata(); i++) {
            tmp += this.getTitolo();
        }
        for(int k = 0; k < this.getVolume(); k++) {
            vol += "!";
        }
        for(int j = 0; j < luminosita; j++) {
            lum += "*";
        }

        tmp += vol;
        tmp += lum;

        return tmp;
    }
}
