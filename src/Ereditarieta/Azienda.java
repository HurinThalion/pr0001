package Ereditarieta;

public class Azienda {

    private String ragioneSociale;
    private String indirizzoSedeLegale;
    private String partitaIva;
    private int dipendenti;

    public Azienda() {}
    public Azienda(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public String getRagioneSociale() {
        return ragioneSociale;
    }

    public String getIndirizzoSedeLegale() {
        return indirizzoSedeLegale;
    }

    public String getPartitaIva() {
        return partitaIva;
    }

    public int getDipendenti() {
        return dipendenti;
    }

    public void setRagioneSociale(String ragioneSociale) {
        this.ragioneSociale = ragioneSociale;
    }

    public void setIndirizzoSedeLegale(String indirizzoSedeLegale) {
        this.indirizzoSedeLegale = indirizzoSedeLegale;
    }

    public void setPartitaIva(String partitaIva) {
        this.partitaIva = partitaIva;
    }

    public void setDipendenti(int dipendenti) {
        this.dipendenti = dipendenti;
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "ragioneSociale='" + ragioneSociale + '\'' +
                ", indirizzoSedeLegale='" + indirizzoSedeLegale + '\'' +
                ", partitaIva='" + partitaIva + '\'' +
                '}';
    }
}
