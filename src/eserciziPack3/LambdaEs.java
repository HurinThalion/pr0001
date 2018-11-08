package eserciziPack3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaEs implements Quadrato {

    public static void main(String[] args) {

        Quadrato quadratoLambda = x -> x-1;
        Quadrato q = new LambdaEs();

        System.out.println(quadratoLambda.opera(3));
        System.out.println(q.opera(3));

        System.out.println("-------");
        Double[] temperature = {20d, 23d, 16d, 26d, 19d};
        List<Double> temps = Arrays.asList(temperature);
        //lambda classica
        temps.stream().forEach(x -> System.out.println(x));
        System.out.println("-------");
        //referenza a metodo statico
        temps.stream().forEach(System.out::println);
        System.out.println("-------");
        //filtrare risultato
        Predicate<Double> maggiore21 = x -> x > 21;
        /*List<Double> ok = */
        temps.stream().filter(maggiore21)
                .peek(x -> System.out.println("DEBUG x : " + x))
                .filter(x -> x > 23)
                //.map(x -> x*-1)
                .forEach(System.out::println);
        //toglendo il foreach, che è temrinatore lo stream non parte neanche

        //.count(), altro terminatore
        //.limit(@par), interrompe il flusso prematuramente
        System.out.println("-------");
        List<Double> ok = temps.stream().filter(maggiore21)
                .peek(x -> System.out.println("DEBUG x : " + x))
                //.filter(x -> x > 23)
                .collect(Collectors.toList());
        ok.forEach(System.out::println);

        System.out.println("-------");
        Stream<Double> s = ok.stream();
        s.filter(x -> x%2 != 0).forEach(System.out::println);
        //questo stream viene consumato e non si può più utilizzare altrove anche
        // se terminato prima con limit
    }

    public double opera(double d) {
        return d*d;
    }
}

@FunctionalInterface
interface Quadrato {

    double opera(double d);
}