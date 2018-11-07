package eserciziPack2.lotto;

public class Schedina {

    private int identificatore;
    private int[] numeri = new int[15];

    public Schedina(int identificatore) {
        this.identificatore = identificatore;
        setNumeri(numeri);
    }

    public int getIdentificatore() {
        return identificatore;
    }

    public int[] getNumeri() {
        return numeri;
    }

    private void setNumeri(int[] numeri) {

        for(int i = 0; i < 15; i++) {
            numeri[i] = 1 + ((int) (Math.random() * 89 + 1));
        }
        controlla(numeri);
    }

    public static void stampaContenuto(int[] numeri) {

        for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i] + "\t");
        }
        System.out.println("");
    }

    private void controlla(int[] numeri) {

        int l = 0;
        for(int k = 0; k < 15; k++) {
            l= numeri[k];
            for(int w = 1; w < 15; w++) {
                if(l == numeri[w]) {
                    if(k != w)
                        setNumeri(numeri);
                }
            }
        }
    }
}
