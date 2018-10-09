package esercizi8.Ecommerce;

public class Televisore extends Prodotto {

    private double pollici;
    private String definizione;


    public Televisore() {
        setCodice();
    }

    public double getPollici() {
        return pollici;
    }

    public void setPollici(double pollici) {
        this.pollici = pollici;
    }

    public String getDefinizione() {
        return definizione;
    }

    public void setDefinizione(String definizione) {
        this.definizione = definizione;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "modello='" + getModello() + '\'' +
                ", codice='" + getCodice() + '\'' +
                ", prezzo=" + getPrezzo() +
                ", disponibilita=" + getDisponibilita() +
                ", pollici=" + pollici +
                ", definizione=" + definizione +
                '}';
    }
}
