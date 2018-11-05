package esDate;

import java.util.*;

import static esDate.UtilityDate.orario;
import static esDate.UtilityDate.scrivi;

//sistema di viaggi che permetta di scegliere la partenza nella data odierna e la destinazione mostrando l'ora di arrivo, la durata del volo e le informazioni sul fuso orario
public class Viaggi {

    public static void main(String[] args) {

        Map<Integer, String> mappa = new HashMap<>();

        mappa.put(0, "milano-roma");
        mappa.put(1, "milano-londra");
        mappa.put(2, "milano-parigi");
        mappa.put(3, "roma-londra");
        mappa.put(4, "roma-parigi");
        mappa.put(5, "londra-parigi");

        Random r = new Random();
        List<String> tratte = new ArrayList<>();

        for(int k = 0; k < 3; k++) {

            int b = r.nextInt(6);
            if(!tratte.contains(mappa.get(b))) {
                tratte.add(mappa.get(b));
            }
        }

        System.out.println("Tratte disponibili oggi : ");
        int i = 0;
        for(String s : tratte) {
            System.out.println("premi " + i++ + " ---> " + s);
        }

        boolean flag = true;
        while(flag) {
            System.out.println("Scegli tratta : ");
            String scelta = scrivi();
            switch (scelta) {
                case "0" :
                    System.out.println("hai scelto " + tratte.get(0));
                    orario(tratte.get(0));
                    flag = false;
                    break;
                case "1" :
                    System.out.println("hai scelto " + tratte.get(1));
                    orario(tratte.get(1));
                    flag = false;
                    break;
                case "2" :
                    System.out.println("hai scelto " + tratte.get(2));
                    orario(tratte.get(2));
                    flag = false;
                    break;
                default :
                    System.out.println("Inserimento non valido!");
            }
        }
    }
}
