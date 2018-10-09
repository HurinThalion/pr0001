package Esercizi6;

public class Chitarrista {

    public final String ruolo = "Chitarrista della band";
    private String nome;
    private int eta;
    private Band band;

    public Chitarrista(String nome, int eta) {
        setNome(nome);
        setEta(eta);
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
