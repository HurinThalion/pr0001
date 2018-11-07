package eserciziPack.esercizi6;

public class Potenza {

    public static void main(String[] args) {

        double x = 2;
        double y = 5;

        double r1 = potenzaIterativa(x, y);
        double r2 = potenzaIterativa(x, -y);
        double r3 = potenzaIterativa(-x, y);
        double r4 = potenzaIterativa(-x, -y);

        double r5 = potenzaRicorsiva(x, y);
        double r6 = potenzaRicorsiva(x, -y);
        double r7 = potenzaRicorsiva(-x, y);
        double r8 = potenzaRicorsiva(-x, -y);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println(r8);
    }

    public static double potenzaIterativa(double b, double e) {

        double ris = 1.0;

        if(e > 0) {

            for (int i = 0; i < e; i++) {
                ris *= b;
            }

        }

        if(e < 0) {

            for (int i = 0; i > e; i--) {
                ris = 1.0 / b * ris;
            }
        }

        return ris;
    }

    public static double potenzaRicorsiva(double b, double e) {
        if(e == 0)
            return 1.0;
        if(b == 0)
            return 0.0;
        if(e < 0)
            return 1.0 / b * potenzaRicorsiva(b, e + 1);
        if(e > 0)
            return b * potenzaRicorsiva(b, e - 1);
        return -1;
    }
}
