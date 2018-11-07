package eserciziPack.esercizi4;

public class LancioMoneta {

    public static void main(String[] args) {

        int t = 0;
        int c = 0;
        int lancio = -1;

        for(int i = 0; i < 10000; i++) {
            lancio = (int) (Math.random() * ((1) + 1));
            if(lancio == 0)
                t++;
            if(lancio == 1)
                c++;
        }
        double r1 = ((double) t/10000)*100;
        double r2 = ((double) c/10000)*100;
        System.out.println("Testa è uscito : " + r1 + " % delle volte!");
        System.out.println("Croce è uscito : " + r2 + " % delle volte!");
    }
}
