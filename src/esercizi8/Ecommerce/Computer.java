package esercizi8.Ecommerce;

public class Computer extends Prodotto {

    private String numeroCore;
    private double vram;

    public Computer() {
        setCodice();
    }

    public String getNumeroCore() {
        return numeroCore;
    }

    public void setNumeroCore(String numeroCore) {
        this.numeroCore = numeroCore;
    }

    public double getVram() {
        return vram;
    }

    public void setVram(double vram) {
        this.vram = vram;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "modello='" + getModello() + '\'' +
                ", codice='" + getCodice() + '\'' +
                ", prezzo=" + getPrezzo() +
                ", disponibilita=" + getDisponibilita() +
                ", numeroCore=" + numeroCore +
                ", vram=" + vram +
                '}';
    }
}
