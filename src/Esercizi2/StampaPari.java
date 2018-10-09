package Esercizi2;

public class StampaPari {
    public static void main(String[] args) {

        int i = 0;
        while(true) {
            i++;
            if(i > 10) {
                break;
            }else {
                if(i % 2 != 0) {
                    continue;
                }
            }
            System.out.println(i);
        }
    }
}
