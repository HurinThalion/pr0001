package esercizi8.Ecommerce;

public abstract class Prodotto {

    private String modello;
    private String codice;
    private double prezzo;
    private double disponibilita = 100;
    private static int it = 0;

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getCodice() {
        return codice;
    }

    public void setCodice() {
        this.codice = "00" + it;
        it++;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(double disponibilita) {
        this.disponibilita -= disponibilita;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "modello='" + modello + '\'' +
                ", codice='" + codice + '\'' +
                ", prezzo=" + prezzo +
                ", disponibilita=" + disponibilita +
                '}';
    }
}
