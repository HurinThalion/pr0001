package eserciziPack.esercizi;

public class TestElenco {
    public static void main(String[] args) {

        Elenco e = new Elenco(3, false);
        e.addItem("ciao");
        e.addItem("ciao1");
        e.addItem("ciao2");
        e.addItem("ciao3");
        e.addItem("ciao4");
        e.addItem("ciao5");
        System.out.println(e.getItem(0));
        System.out.println(e.getItem(1));
        System.out.println(e.getItem(2));
        System.out.println(e.getItem(3));
        System.out.println(e.getItem(12));

        Elenco e2 = new Elenco(3, true);
        e2.addItem(""+1);
        e2.addItem(""+2);
        e2.addItem(""+3);
        e2.addItem(""+5);

        System.out.println(e2.getIntItem(0));
        System.out.println(e2.getIntItem(1));
        System.out.println(e2.getIntItem(2));
        System.out.println(e2.getIntItem(3));
        System.out.println(e2.getIntItem(4));
    }
}
