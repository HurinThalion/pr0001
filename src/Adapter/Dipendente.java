package Adapter;

public class Dipendente {

    private String nominativo;
    private String tesserino;
    private String email;
    private String mansione;
    private double stipendio;

    public Dipendente(String nominativo, String tesserino, String email, String mansione, double stipendio) {
        this.nominativo = nominativo;
        this.tesserino = tesserino;
        this.email = email;
        this.mansione = mansione;
        this.stipendio = stipendio;
    }

    public String getNominativo() {
        return nominativo;
    }

    public String getTesserino() {
        return tesserino;
    }

    public String getEmail() {
        return email;
    }

    public String getMansione() {
        return mansione;
    }

    public double getStipendio() {
        return stipendio;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "nominativo='" + nominativo + '\'' +
                ", tesserino='" + tesserino + '\'' +
                ", email='" + email + '\'' +
                ", mansione='" + mansione + '\'' +
                ", stipendio=" + stipendio +
                '}';
    }
}
