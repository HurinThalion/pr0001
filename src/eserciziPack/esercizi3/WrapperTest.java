package eserciziPack.esercizi3;

public class WrapperTest {
    public static void main(String[] args) {

        int i = 0;
        int l = 0;
        char c = 'f';
        Integer n = 0;
        int[] ai = new int[] {0, 0, 0};
        long b = 0;


        metodo(l, c);           //quindi se c'è wrapper e primitivo sceglie prima il primitivo
        metodo(n, i, l);        //se c'è varargs e singolo elemento sceglie il singolo prima
        metodo(n, i);           //e fa prima cast tra i primitivi piuttosto che
        metodo(i, b);           //boxxare nella clase wrapper
    }


    public static void metodo(int i, Long c) {
        System.out.println("metodo2");
    }
    public static void metodo(Integer i, int... c) {
        System.out.println("metodo4");
    }
    public static void metodo(Integer i, int c) {
        System.out.println("metodo3");
    }
    public static void metodo(int i, int c) {
        System.out.println("metodo1");
    }
}
