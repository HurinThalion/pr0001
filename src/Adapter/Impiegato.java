package Adapter;

public class Impiegato {

    private String nominativo;
    private String stipendio;
    private String tesserino;

    public Impiegato(String nominativo, String stipendio, String tesserino) {
        this.nominativo = nominativo;
        this.stipendio = stipendio;
        this.tesserino = tesserino;
    }

    public String getNominativo() {
        return nominativo;
    }

    public String getStipendio() {
        return stipendio;
    }

    public String getTesserino() {
        return tesserino;
    }

    @Override
    public String toString() {
        return "Impiegato{" +
                "nominativo='" + nominativo + '\'' +
                ", email='" + stipendio + '\'' +
                ", tesserino='" + tesserino + '\'' +
                '}';
    }
}
