package eserciziPack.esercizi;

public class Principale {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.nome = "mario";
        p2.nome = "marietto";
        p1.cognome = "rossi";
        p2.cognome = "rossini";
        p1.età = 21;
        p2.età = 24;
        Persona p3 = new Persona();
        p3 = p1;

        System.out.println(p1.dettagli());
        System.out.println(p2.dettagli());
        System.out.println(p3.dettagli());

    }
}
