package Videoteca;

public class Prodotti {

    private String nome;
    private int disponibilita;

    public Prodotti(String nome, int disponibilita) {
        setNome(nome);
        setDisponibilita(disponibilita);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita) {

        if(disponibilita < 0) {
            System.out.println("Impossibile, riprova");
        }else {
            this.disponibilita = disponibilita;
        }
    }

    @Override
    public String toString() {
        return "Prodotti{" +
                "nome='" + nome + '\'' +
                ", disponibilita aggiornata =" + disponibilita +
                '}';
    }

    public void aggiornaDisponibilita() {
        if(this.disponibilita >= 1)
            this.disponibilita -= 1;
    }
}
