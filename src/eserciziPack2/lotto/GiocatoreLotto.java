package eserciziPack2.lotto;

public class GiocatoreLotto {

    private String nome;
    private int portafoglio = 100;
    private Schedina scheda;
    private int vincita;

    public GiocatoreLotto(String nome, int identificatore) {
        this.nome = nome;
        this.scheda = new Schedina(identificatore);
    }

    public String getNome() {
        return nome;
    }

    public int getPortafoglio() {
        return portafoglio;
    }

    public void setPortafoglio(int x) {
        portafoglio = portafoglio - x;
    }

    public void setPortafoglio2(int x) {
        portafoglio = portafoglio + x;
    }

    public int getScheda() {
        return scheda.getIdentificatore();
    }

    public int[] getContenutoScheda() {
        return scheda.getNumeri();
    }

    public int getVincita() {
        return vincita;
    }

    public void setVincita() {
        setPortafoglio2(10);
    }
}
