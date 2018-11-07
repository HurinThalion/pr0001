package eserciziPack2.tacoBell;

public class Autovettura implements Comparable<Autovettura>{

    private String marca;
    private String modello;
    private String alimentazione;
    private int cilindrata;

    public Autovettura(String marca, String modello, String alimentazione, int cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.alimentazione = alimentazione;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Autovettura{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", alimentazione='" + alimentazione + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }

    @Override
    public int compareTo(Autovettura o) {
        return this.cilindrata - o.cilindrata;
    }
}
