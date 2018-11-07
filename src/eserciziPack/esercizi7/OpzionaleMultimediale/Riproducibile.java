package eserciziPack.esercizi7.OpzionaleMultimediale;

public abstract class Riproducibile extends ElementoMultimediale implements InterfacciaRip  {

    private int durata = 0;
    private int volume = 0;

    public Riproducibile(String titolo, int durata, int volume) {
        super(titolo);
        if(durata >= 0 && volume >= 0) {
            this.durata = durata;
            this.volume = volume;
        }else {
            System.out.println("Inserire parametri positivi");
            System.out.println("messi a zero di default");
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    public void weaker() {
        if(volume > 0)
            volume--;
        else
            System.out.println("Volume al minimo");
    }

    public void louder() {
        volume++;
    }

    public String play() {

        String tmp = "";
        String vol = "";
        for(int i = 0; i < durata; i++) {
            tmp += this.getTitolo();
        }
        for(int k = 0; k < volume; k++) {
            vol += "!";
        }
        tmp += vol;

        return tmp;
    }
}
