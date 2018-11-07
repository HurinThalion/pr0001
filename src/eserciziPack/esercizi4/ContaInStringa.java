package eserciziPack.esercizi4;

public class ContaInStringa {

    public static int contaParole(String str) {

        int c = 1;

        if(str.length() == 0)
            return 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                c++;
            }
        }

        if(str.charAt(str.length() - 1) == ' ')
            c--;

        return c;
    }

    public static int contaCaratteri(String str) {



        return 0;
    }
}
