package ProveClassi;

import Ereditarieta.Persona;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.function.Function;

public class AppMirror {

    public static void main(String[] args) {

        Persona p1 = new Persona("Mario", "Rossi","saesdeswawswqert");
        Object b = new Object();

        System.out.println(p1.getClass().getMethods().length);
        System.out.println(p1.getClass().getConstructors().length);
        System.out.println(b.getClass().getConstructors().length);

        //Constructor[] cons = p1.getClass().getConstructors();
        /*for(int i = 0; i < cons.length; i++) {
            System.out.println(cons[i].getParameterCount());
            try {
                if(cons[i].getParameterCount() > 50) {
                    Persona p = ((Persona) cons[i].newInstance());
                    p.setNome("Pino");
                    System.out.println(p.getNome());
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }


        try {
            Class c = Class.forName(Integer.class.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("nonon");
            e.printStackTrace();
        }*/


        Double pi = Math.PI;
        Function<Double, Double> circonferenza =
                (Double raggio) -> {
                return 2 * pi * raggio;
            };

        System.out.println(circonferenza.apply(2.0));

        System.out.println("--Ceil--");
        System.out.println(Math.ceil(2.8));
        System.out.println(Math.ceil(2.3));
        System.out.println("--Floor--");
        System.out.println(Math.floor(2.8));
        System.out.println(Math.floor(2.3));
        System.out.println("--Round--");
        System.out.println(Math.round(2.8));
        System.out.println(Math.round(2.3));
        System.out.println(Math.round(2.5));

        Double daArrotondare = 15.556789;
        System.out.println(Math.round(daArrotondare*100d)/100d);

        Locale l = Locale.ENGLISH;
        System.out.printf("Value: %.2f ", daArrotondare);
        System.out.printf("Value: %.2f ", daArrotondare);
    }
}
