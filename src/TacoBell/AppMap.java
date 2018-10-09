package TacoBell;

import java.util.*;

public class AppMap {

    public static void main(String[] args) {

        //JSON EXAMPLE
        /*
            {
                "valore" : "valoreChaive",
                "stipendio" : 2000,
                "sposato" : false
            }
         */

        Map<Integer, String> classifica = new HashMap<>();
        classifica.put(1, "Franco");
        classifica.put(2, "FrancoForte");
        classifica.put(3, "FrancoPiano");


        System.out.println(classifica.get(1));

        Queue<String> coda = new LinkedList<>();
        Deque<String> coda2 = new LinkedList<>();
        coda.add("valerio");
        coda.offer("VValerio");
        System.out.println(coda);
        coda.remove(); //a differenza di poll lancia eccezione se coda vuota
        coda.poll();  //così come altri metodi che fan roba uguale ma con questa differenza
        System.out.println(coda);
        coda.add("Gigi");
        //coda.element();
        //coda.peek();



    }
}
