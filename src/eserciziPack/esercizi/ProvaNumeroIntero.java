package eserciziPack.esercizi;

public class ProvaNumeroIntero {
    public static void main(String args[]) {
        NumeroIntero n1 = new NumeroIntero();
        NumeroIntero n2 = new NumeroIntero();

        //n1.numeroIntero = 3;
        //n2.numeroIntero = 5;
        /*n1.stampaNumero();
        n2.stampaNumero();
        n1.numeroIntero = n2.numeroIntero;
        n1.stampaNumero();*/

        int a = 5;
        int b = 3;
        double r1 = (double) a/b;
        System.out.println(r1);

        char c = 'a';
        short s = 5000;
        int r2 = (int) c*s;
        System.out.println(r2);

        int i = 6;
        float f = 3.14f;
        double r3 = (double) i+f;
        System.out.println(r3);

        double r4 = r1 - r2 - r3;
        System.out.println(r4);
    }
}
