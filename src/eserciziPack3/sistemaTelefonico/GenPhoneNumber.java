package eserciziPack3.sistemaTelefonico;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenPhoneNumber {

    public static String generaNumeroTel() {

        Random r = new Random();
        int nTel = r.nextInt(99_999_999);
        return "+39 0" + nTel;
    }

    public static String generaNumeroCell() {

        Random r = new Random();
        int nCell = r.nextInt(999_999_999);
        return "+39 3" + nCell;
    }

    public static String generaNome() {

        String str = "";
        Random r = new Random();
        int t = r.nextInt(DizionarioGenPhoneNumber.names.length);
        str = DizionarioGenPhoneNumber.names[t];
        return str;
    }

    public static String generaIndirizzo() {

        String str = "";
        Random r = new Random();
        int t = r.nextInt(DizionarioGenPhoneNumber.adresses.length);
        str = "via " + DizionarioGenPhoneNumber.adresses[t];
        return str;
    }

    public static String generaEmail(String nome, String indirizzo) {

        String str = nome + "." + indirizzo.replaceAll(" ", "")
                + "@ggmail.com";
        return str;
    }

    public static List<String> faiTutto() {

        List<String> lista = new ArrayList<>();
        lista.add(generaNumeroTel());
        lista.add(generaNumeroCell());
        lista.add(generaNome());
        lista.add(generaIndirizzo());
        lista.add(generaEmail(lista.get(2), lista.get(3)));

        return lista;
    }

}
