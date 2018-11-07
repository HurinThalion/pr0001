package eserciziPack2.adapter;

import java.util.ArrayList;
import java.util.List;

public class MainAdpaterDipendente {

    public static void main(String[] args) {

        Impiegato i1 = new Impiegato("Mario", "12000", "0034");

        List<Dipendente> dipendenti = new ArrayList<>();

        DipendenteInterface dadp = new DipendenteAdapter();
        Dipendente dip = dadp.getDipendente(i1);

        dipendenti.add(dip);



        System.out.println(dipendenti);
    }
}
