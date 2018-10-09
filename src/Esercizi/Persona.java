package Esercizi;

public class Persona {
    public String nome;
    public String cognome;
    public int età;

    public String dettagli() {
        return "nome : " + nome + " cognome : " + cognome
                + " eta : " + età;
    }
}
