package Esercizi;

import java.util.Scanner;

public class Palindroma {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        System.out.println("Scrivi stringa : ");
        String s = n.nextLine();
        boolean v = testPalindroma(s);
        System.out.println(v);

    }

    public static boolean testPalindroma(String s) {

        int cont = 0;
        boolean flag = false;

        for(int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) == s.charAt((s.length() - 1) - i)) {
                cont++;
                if(cont == s.length()/2) {
                    flag = true;
                    return flag;
                }
            }
        }
        return flag;
    }
}
