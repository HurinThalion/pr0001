package eserciziPack2.ereditarieta;

public class AppAzienda {

    Dipendente[] registro;

    public static void main(String[] args) {

        AppAzienda app = new AppAzienda();
        app.init();

        for(Dipendente d : app.registro) {
            System.out.println(d.toString());
        }

        for(Dipendente d : app.registro) {
            System.out.println(d.getNome().toUpperCase() + " "
                        + d.getCognome().toUpperCase() + " "
                        + (d.getContratto() != null ? d.getContratto().getNome() : "-") + " "
                        + d.getCompensoConcordato());
        }

        //System.out.println(nextre.toString());
        /*Contratto c1 = new Contratto("123", "base", 8, true);
        Contratto c2 = new Contratto("125", "pro", 8, true);
        Dipendente d1 = new Dipendente(nextre, 1000, "programmatore", c1);
        Dipendente d2 = new Dipendente(nextre, 1000, "programmatore", c2);
        System.out.println(d1.toString());
        System.out.println(d2.toString());

        Dipendente[] dip = new Dipendente[]{d1, d2};
        Dipendente[] dipd = new Dipendente[nextre.getDipendenti()];*/



    }

    public void init() {
        Azienda nextre = new Azienda("Nextre Engineering S.R.L.");
        nextre.setDipendenti(10);
        nextre.setIndirizzoSedeLegale("via Imepria 2");
        nextre.setPartitaIva("15253ghfhdh74");

        Dipendente capo = new Dipendente();
        Dipendente contabile = new Dipendente();
        Dipendente commerciale = new Dipendente();
        Dipendente dev1 = new Dipendente();
        Dipendente dev2 = new Dipendente();

        capo.setNome("Mirko");
        capo.setCognome("Cuneo");
        capo.setRuolo("Grande Boss");
        capo.setAzienda(nextre);
        capo.setCf("MRKCN076T14H345L");

        contabile.setNome("Peppino");
        contabile.setCognome("Capri");
        contabile.setRuolo("Stacca Stipendi");
        contabile.setAzienda(nextre);
        contabile.setContratto(new Contratto("008j", "fuffoloso",
                80, false));
        commerciale.setCompensoConcordato(1000);

        commerciale.setNome("Aria");
        commerciale.setCognome("Fritta");
        commerciale.setRuolo("Vendi Fuffa");
        commerciale.setAzienda(nextre);
        commerciale.setContratto(new Contratto("008k", "fuffolo",
                80, false));
        commerciale.setCompensoConcordato(1200);

        dev1.setNome("aldo");
        dev1.setCognome("rossi");
        dev1.setRuolo("Scrive codice");
        dev1.setAzienda(nextre);
        dev1.setContratto(new Contratto("009k", "metalmeccanico",
                160, true));
        dev1.setCompensoConcordato(1450);

        dev2.setNome("giovanni");
        dev2.setCognome("verdi");
        dev2.setRuolo("Scrive super codice");
        dev2.setAzienda(nextre);
        dev2.setContratto(new Contratto("009j", "metalmeccanico",
                160, true));
        dev2.setCompensoConcordato(1350);

        registro = new Dipendente[] {capo, contabile, commerciale, dev1, dev2};
    }
}
