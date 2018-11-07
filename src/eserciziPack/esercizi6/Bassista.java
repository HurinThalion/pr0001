package eserciziPack.esercizi6;

public class Bassista {

    public final String ruolo = "Bassista della band";
    private String nome;
    private int eta;
    private Band band;

    public Bassista(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public Band getBand() {
        return band;
    }

    public void setBand(Band band) {
        this.band = band;
    }
}
