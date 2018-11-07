package eserciziPack2.generici;

import eserciziPack2.ereditarieta.Persona;

import java.util.*;

public class AppGenerici {

    public static void main(String[] args) {

        Persona p1 = new Persona("Mario", "Rossi", "dfgfgfgfgfg");
        Persona p2 = new Persona("Federico", "Milsei", "hjhjhjhjhj");
        Persona p3 = new Persona("Paolo", "Paiii", "dfdfdfdf");

        Urna<Persona> u = new Urna();
        u.add(p1);
        u.add(p2);
        u.add(p3);
        System.out.println(u.getItem(2));

        //List<String> iscritti = new ArrayList<>();
        List<String> iscritti = new LinkedList<>();
        iscritti.add("m.rossi@gmail.com");
        iscritti.add("p.verdi@gmail.com");
        iscritti.add("v.bianchi@gmail.com");

        Iterator<String> t = iscritti.iterator();
        while(t.hasNext()) {
            System.out.println(t.next());
        }

        List<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(i.get(0) + 5);
        System.out.println(i.get(1));
        System.out.println(i);
    }


}

class Urna<T> {

    T[] obj;
    int k;
    public Urna() {
        obj = (T[]) new Object[3];
        k = 0;
    }

    public void add(T o) {
        this.obj[k++] = o;
    }

    public Object getItem(int i) {
        return obj[i];
    }

}
