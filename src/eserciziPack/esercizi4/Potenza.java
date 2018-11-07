package eserciziPack.esercizi4;

public class Potenza {

    static public double potenzaRicorsiva(double b, double e) {

        if(b == 0)
            return  0.0;
        if(e == 0)
            return 1.0;
        if(e > 0)
            return b * potenzaRicorsiva(b, e - 1);
        if(e < 0)
            return 1.0 / b * potenzaRicorsiva(b, e + 1);
        return 0.0;
    }

    static public double potenzaIterativa(double b, double e) {
        double r = 1.0;

        if(e > 0) {
            for(int i = 0; i < e; i++) {
                r = b * r;
            }
        }

        if(e < 0) {
            for(int i = 0; i > e; i--) {
                r = 1.0 / b * r;
            }
        }

        return r;
    }

    public static void main(String[] args) {

        System.out.println(potenzaRicorsiva(2, 3));
        System.out.println(potenzaRicorsiva(-2, 3));
        System.out.println(potenzaRicorsiva(2, -3));
        System.out.println(potenzaRicorsiva(-2, -3));

        System.out.println(potenzaIterativa(2, 3));
        System.out.println(potenzaIterativa(-2, 3));
        System.out.println(potenzaIterativa(2, -3));
        System.out.println(potenzaIterativa(-2, -3));
    }
}
