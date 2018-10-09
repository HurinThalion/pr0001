package Ereditarieta;

public class Contratto {

    private String codiceContratto;
    private String nome;
    private int ore;
    private boolean fulltime;

    public Contratto(String codiceContratto, String nome, int ore,
                     boolean fulltime) {
        this.codiceContratto = codiceContratto;
        this.nome = nome;
        this.ore = ore;
        this.fulltime = fulltime;
    }

    public String getCodiceContratto() {
        return codiceContratto;
    }

    public void setCodiceContratto(String codiceContratto) {
        this.codiceContratto = codiceContratto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getOre() {
        return ore;
    }

    public void setOre(int ore) {
        this.ore = ore;
    }

    public boolean isFulltime() {
        return fulltime;
    }

    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }

    @Override
    public String toString() {
        return "Contratto{" +
                "codiceContratto='" + codiceContratto + '\'' +
                '}';
    }
}
