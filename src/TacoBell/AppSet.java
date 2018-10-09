package TacoBell;

import java.util.*;

public class AppSet {

    public static void main(String[] args) {

        boolean flag;

        List<String> mail = new ArrayList<>();
        mail.add("Dario@gmail.com");
        mail.add("Bario@gmail.com");
        mail.add("Dario@gmail.com");
        mail.add("ZZZario@gmail.com");
        mail.add("OPOPario@gmail.com");


        Set<String> iscritti = new HashSet<>();
        flag = iscritti.add("rrrrDario@gmail.com");
        System.out.println(flag);
        flag = iscritti.addAll(mail);
        System.out.println(flag);
        iscritti.stream().forEach(System.out::println);

        System.out.println("-------------");

        Set<String> tree = new TreeSet<>(iscritti);
        tree.stream().forEach(System.out::println); //stampa ordinata perchè string implementa comapreTo

        Autovettura classeA = new Autovettura("Mercedes", "Classe A", "Uranio",
                2000);
        Autovettura opelCorsa = new Autovettura("Opel", "Corsa", "Olio",
                1400);
        Autovettura fiatPunto = new Autovettura("Fiat", "Punto", "Speranza",
                10000);

        Set<Autovettura> auto1 = new HashSet<>();
        auto1.add(classeA);
        auto1.add(opelCorsa);
        auto1.add(fiatPunto);
        System.out.println("-------------------");
        System.out.println("auto1");
        auto1.stream().forEach(System.out::println);
        System.out.println("-------------------");
        System.out.println("auto2");
        Set<Autovettura> auto2 = new TreeSet<>();
        flag = auto2.add(classeA);
        System.out.println(flag);
        flag = auto2.add(opelCorsa);
        System.out.println(flag);
        flag = auto2.add(fiatPunto);
        System.out.println(flag);

        auto2.stream().forEach(System.out::println);
        System.out.println("-----------------------");
        Iterator<Autovettura> i = ((TreeSet<Autovettura>) auto2).descendingIterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }


    }
}
