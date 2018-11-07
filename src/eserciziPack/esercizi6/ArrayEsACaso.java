package eserciziPack.esercizi6;

import java.util.Random;

public class ArrayEsACaso {

    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = new int[10];
        int max = -1;
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10001);
            if(arr[i] > max) {
                max = arr[i];
                c = i;
            }
        }
        System.out.println("posizione : " + c);
        System.out.println("valore max : " + max);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
