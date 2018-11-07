package eserciziPack.esercizi4;

import java.util.Scanner;

public class AncoraMatrici {

    public static void main(String[] args) {

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        Scanner s = new Scanner(System.in);

        System.out.println("popola matrice 1 : ");

        for (int i = 0; i < matrix1.length ; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }

        System.out.println("popola matrice 2 : ");

        for (int i = 0; i < matrix2.length ; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[i][j] = s.nextInt();
            }
        }

        int[][] matrixFin = new int[3][3];

        System.out.println("confronto le 2 matrici : ");

        for (int i = 0; i < matrixFin.length ; i++) {
            for (int j = 0; j < matrixFin.length; j++) {
                if(matrix1[i][j] == matrix2[i][j]) {
                    matrixFin[i][j] = 0;
                }
                if(matrix1[i][j] < matrix2[i][j]) {
                    matrixFin[i][j] = -1;
                }
                if(matrix1[i][j] > matrix2[i][j]) {
                    matrixFin[i][j] = 1;
                }
            }
        }

        System.out.println("Ecco il confronto : ");

        for(int i = 0; i < matrixFin.length; i++) {
            for(int j = 0; j < matrixFin.length; j++) {
                System.out.print(matrixFin[i][j] + "\t");
            }
            System.out.println("");
        }


    }
}
