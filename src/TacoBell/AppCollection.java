package TacoBell;

import Ereditarieta.Persona;

import java.util.ArrayList;
import java.util.List;

public class AppCollection {

    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();

        l1.add("Valerio");
        l1.add("Moreno");
        l1.add("Mirko");
        l1.add("Valerio");
        l1.add("Elisa");
        System.out.println(l1.remove(l1.lastIndexOf("Valerio")));
        //l1.remove("Valerio");

        List<Persona> iscritti = new ArrayList<>();
        iscritti.add(new Persona("Valerio", "Radice", "hghghghghghgghgh"));

        Persona daCancellare = new Persona("Valerio", "Radice", "hghghghghghgghgh");
        iscritti.add(daCancellare);
        //boolean ris1 = iscritti.remove(daCancellare);

        //boolean ris = iscritti.remove(new Persona("Valerio", "Radice", "hghghghghghgghgh"));

       // System.out.println(ris1);
       // System.out.println(iscritti);
        //boolean r = l1.remove("Valerio");
        //l1.clear();

        System.out.println(l1);
        //System.out.println(r);

    }
}
