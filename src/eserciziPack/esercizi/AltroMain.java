package eserciziPack.esercizi;

public class AltroMain {
    public static void main(String args[]) {

        int[][] misurazioni = new int[6][];
        misurazioni[0] = new int[] {14, 18, 20, 22, 24, 25};
        misurazioni[1] = new int[] {18, 22, 24};
        misurazioni[2] = new int[] {16};
        misurazioni[3] = new int[] {18, 20, 24, 25};
        misurazioni[4] = new int[] {15, 18, 21, 22, 26, 25};
        misurazioni[5] = new int[] {12, 16, 20, 21, 21, 20, 19, 18};

        for(int i = 0; i < misurazioni.length; i++) {
            //System.out.println(misurazioni[i].length);
            for(int k = 0; k < misurazioni[i].length; k++) {
                System.out.print("\t" + misurazioni[i][k]);
            }
            System.out.println("");

        }
        double m = 0;

        for(int i = 0; i < misurazioni.length; i++) {
            int somma = 0;
            double media = 0;
            for(int k = 0; k < misurazioni[i].length; k++) {
                somma = somma + misurazioni[i][k];
                media = somma/((double)(misurazioni[i].length));
            }
            System.out.println(media);
        }


    }
}
