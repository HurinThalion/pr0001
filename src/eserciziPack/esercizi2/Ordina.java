package eserciziPack.esercizi2;

public class Ordina {
    public static void main(String[] args) {

        int[] v = new int[10];
        for(int i = 0; i < v.length; i++) {
            v[i] = 5 + (int) (Math.random() * ((10 - 5) + 1));
        }

        for(int l : v) {
            System.out.print(l + "\t");
        }
        System.out.println("");
        bubblesort(v);

        for(int l : v) {
            System.out.print(l + "\t");
        }
    }

    public static void bubblesort(int[] n) {
        int tmp = 0;
        for(int l = 0; l < n.length; l++) {
            for (int k = 1; k < n.length - l; k++) {
                if (n[k - 1] > n[k]) {
                    tmp = n[k - 1];
                    n[k - 1] = n[k];
                    n[k] = tmp;
                }
            }
        }
    }
}
