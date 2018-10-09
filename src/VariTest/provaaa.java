package VariTest;

public class provaaa {

    public static void main(String[] args) {

        double d = 24;
        double d1 = 16;

        System.out.println(pot(d));
        System.out.println(pot2(d));
        System.out.println(pot(d1));
        System.out.println(pot2(d1));


    }

    public static boolean pot(double dab) {

        int k = 1;
        for(int i = 1; i <= dab; i++) {
           k *= 2;
           if(k == dab)
               return true;
       }
       return false;
    }

    public static boolean pot2(double dab) {

        double k = dab;
        for(int i = 1; i <= dab; i++) {
            k /= 2;
            if(k == 1)
                return true;
        }
        return false;
    }
}
