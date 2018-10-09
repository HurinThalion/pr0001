package esercizi8;

import java.util.Scanner;

public class CercaParola {

    public static void main(String[] args) {

        final String str = "Scrivo una stringa lungha per vedere se so cosa significa dover ogni volta mettersi qua a fare robe che poi a nessuno frega veramente di cosa c'è scritto ma mi serve avere un testo lungo che possa suscitare nell'immaginario collettivo la più alta consapevolezza e moralità del senso ultimo di quello che non possiamo sapere o possedere perchè non è detto che le negazioni che si trovano in fondo al mare poi vengono a galla ma di certo se utilizzo un vocabolario ampio sarà più divertente il programma perchè è più facile e non difficile trovare le parole o la parola che mi serve per dare all'utente finale qualcosa di sostanzioso e utile da vedere, sentire fare e baciare.";

        //System.out.println(str);
        Scanner s = new Scanner(System.in);
        System.out.println("Scrivi una parola, io la cercherò nel testo!");
        int x = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ') {
                x++;
            }
        }

        String[] tmp = new String[x + 1];
        int posI = 0;
        int posF = 0;
        String sdsd = str;

        for(int k = 0; k < tmp.length; k++) {
            posF = sdsd.indexOf(' ');
            if (posF >= 0) {
                tmp[k] = sdsd.substring(posI, posF);
                sdsd = sdsd.substring(posF + 1);
            }else
                tmp[k] = sdsd;

        }

        String parola = s.nextLine();
        boolean flag = true;
        int count = 0;
        do {
            for(String kk : tmp) {
                if(kk.equalsIgnoreCase(parola)) {
                    count++;
                    flag = false;
                }
            }
            try {
                if(flag)
                    throw new Exception();
            }catch(Exception e){
                System.out.println("Inserisci una nuova parola : ");
                parola = s.nextLine();
            }
        }while(flag);


        System.out.println("Parola trovata : " + count + " volte");
    }
}
