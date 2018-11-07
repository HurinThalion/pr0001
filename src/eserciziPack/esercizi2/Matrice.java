package eserciziPack.esercizi2;

public class Matrice {

    public static void main(String[] args) {
        int[][] matrice = new int[14][14];

        for(int i = 0; i < matrice.length; i++) {
            for(int k = 0; k < matrice.length; k++) {
                matrice[i][k] = k * i;
            }
        }
        for(int i = 0; i < matrice.length; i++) {
            for(int k = 0; k < matrice.length; k++) {
                System.out.print(matrice[i][k] + "\t");
            }
            System.out.println("");
        }

    }
}
