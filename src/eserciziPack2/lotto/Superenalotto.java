package eserciziPack2.lotto;

public class Superenalotto {

    public static void main(String[] args) {

        GiocatoreLotto g1 = new GiocatoreLotto("Player1",9001);
        GiocatoreLotto g2 = new GiocatoreLotto("Player2",9002);
        GiocatoreLotto g3 = new GiocatoreLotto("Player3",9003);
        GiocatoreLotto g4 = new GiocatoreLotto("Player4",9004);

        System.out.print(g1.getNome() + " " + g1.getScheda() + " : ");
        Schedina.stampaContenuto(g1.getContenutoScheda());
        System.out.print(g2.getNome() + " " + g2.getScheda() + " : ");
        Schedina.stampaContenuto(g2.getContenutoScheda());
        System.out.print(g3.getNome() + " " + g3.getScheda() + " : ");
        Schedina.stampaContenuto(g3.getContenutoScheda());
        System.out.print(g4.getNome() + " " + g4.getScheda() + " : ");
        Schedina.stampaContenuto(g4.getContenutoScheda());

        System.out.println("\n" + "Portafoglio players1 prima di giocare : " + g1.getPortafoglio() + "\n");
        System.out.println("\n" + "Portafoglio players2 prima di giocare : " + g2.getPortafoglio() + "\n");
        System.out.println("\n" + "Portafoglio players3 prima di giocare : " + g3.getPortafoglio() + "\n");
        System.out.println("\n" + "Portafoglio players4 prima di giocare : " + g4.getPortafoglio() + "\n");

        System.out.println("Nessuno ha ancora il premio : ");
        System.out.println(g1.getPortafoglio());
        System.out.println(g2.getPortafoglio());
        System.out.println(g3.getPortafoglio());
        System.out.println(g4.getPortafoglio());

        ChiamaNumeriLotto.gioco(g1.getContenutoScheda(), g2.getContenutoScheda(),
                g3.getContenutoScheda(),g4.getContenutoScheda(), g1, g2, g3, g4);

        System.out.println("\n" + "Portafoglio players1 dopo aver giocato : " + g1.getPortafoglio() + "\n");
        System.out.println("\n" + "Portafoglio players2 dopo aver giocato : " + g2.getPortafoglio() + "\n");
        System.out.println("\n" + "Portafoglio players3 dopo aver giocato : " + g3.getPortafoglio() + "\n");
        System.out.println("\n" + "Portafoglio players4 dopo aver giocato : " + g4.getPortafoglio() + "\n");

        System.out.println("Il premio va al vincitore : ");
        System.out.println(g1.getPortafoglio());
        System.out.println(g2.getPortafoglio());
        System.out.println(g3.getPortafoglio());
        System.out.println(g4.getPortafoglio());
    }
}
