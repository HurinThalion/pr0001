package eserciziPack.esercizi3;

public class EssBooleane {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;
        int z = 0;

        //boolean b1 = (++x == 1); //true perchè pre-incremento
        //boolean b2 = (x++ == 2); // false perchè post-incremento
        //System.out.println(b1);
        //System.out.println(b2);
        //boolean b3 = (false && x++>x);
        //System.out.println(x); //rimane 0 perchè non entra nella seconda clausola
        //boolean b4 = (false & x++>x);
        //System.out.println(x); // questo invece è 1
        System.out.println(z++>z);
        boolean b12 = ++z>z;//il maggiore/minore ha precendenza su incremento sempre
        System.out.println(z);
        System.out.println(b12);


    }
}
