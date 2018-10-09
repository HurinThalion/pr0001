package Esercizi6;

public class InvertiStringa {

    public static void main(String[] args) {

        String str = "Pappalardo";
        String tmp = "";
        String fin = "";

        for (int i = 0; i < str.length(); i++) {
            tmp += str.charAt((str.length() - 1) - i);
        }
        System.out.println("Stringa iniziale : " + str);
        System.out.println("Stringa invertita : " + tmp);

        for (int i = 0; i < str.length(); i++) {
            fin = fin + (char) (str.charAt(i) + tmp.charAt(i));
        }

        System.out.println("Somma carattere per carattere delle 2 stringhe : "
            + fin);
    }
}
