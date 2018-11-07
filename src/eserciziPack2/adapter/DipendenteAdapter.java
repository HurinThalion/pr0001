package eserciziPack2.adapter;

public class DipendenteAdapter implements DipendenteInterface {

    public Dipendente getDipendente(Impiegato i) {

        Dipendente d = new Dipendente(i.getNominativo(), i.getTesserino(), "", "",
                Double.parseDouble(i.getStipendio()));

        return d;
    }
}
