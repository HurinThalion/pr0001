package Ricorsione;

import java.util.Scanner;

public class Fib {

    public static int fibonacci(int i) {
        if(i == 1 || i == 2) {
            return 1;
        }
        if(i > 2) {
            return fibonacci(i - 2) + fibonacci(i - 1);
        }
        return -1;
    }

    public static void registraFib(int[] x) {

        int cont = 1;

        for(int k = 0; k < x.length; k++) {
            x[k] = fibonacci(cont);
            cont++;
        }
    }

}
