package eserciziPack2.videoteca;

import java.util.ArrayList;
import java.util.List;

public class UtenteVideoteca {

    private String nome;
    private List<Prodotti> prodottiNoleggiati = new ArrayList<>();


    public UtenteVideoteca(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public List<Prodotti> getProdottiNoleggiati() {
        return prodottiNoleggiati;
    }

    public void addProdottiNoleggiati(Prodotti p) {
        if(p.getDisponibilita() > 0) {
            prodottiNoleggiati.add(p);
            p.aggiornaDisponibilita();
        }else
            System.out.println("Non ci sono copie disponibili di " + p.getNome());
    }


}
