package VariTest;

public class Test2 {

    public static void main(String[] args) {
        int a = 19;
        int b = 5;

        System.out.println(divisione(a, b));
        System.out.println(divisione2(a, b)); //questo più bello
    }

    public static int divisione(int dividendo, int divisore) {
        int c = 0;
        int l = dividendo;
        if(divisore > 0) {
            for(int i = 0; i < dividendo; i++) {
                l = l - divisore;
                if(l >= 0)
                    c++;
            }
        }
        return c;
    }

    public static int divisione2(int x, int y) {
        int k = 0;
        if(x == y)
            return 1;
        while(x >= y) {
            x -= y;
            k++;
        }
        return k;
    }
}
