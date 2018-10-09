package TacoBell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Generatori {
    public static String GeneraPizze()
    { List<String> tipopizza = Arrays.asList("Margherita","Marinara","Calzone","Focaccia","Piadina");
        //"Patate","Cetrioli","Ananas","Wurstel","Vodka","Crauti","Paperino","Pluto"
        List<String> ingredienti = new ArrayList<>(Arrays.asList("Patate","Cetrioli","Ananas","Wurstel","Vodka","Crauti","Paperino","Pluto"));
        //NO xkè Arrays.asList è final!
        //List<String> ingredienti = Arrays.asList("Patate","Cetrioli","Ananas","Wurstel","Vodka","Crauti","Paperino","Pluto");

        Random random = new Random();
        int casuale;
        String pizza = "";
        casuale = random.nextInt(tipopizza.size());
        pizza = tipopizza.get(casuale);
        pizza = pizza+ " Con ";
        for (int x=0;x<=random.nextInt(3);x++) {
            casuale = random.nextInt(ingredienti.size());
            pizza = pizza +" "+ ingredienti.get(casuale);
            ingredienti.remove(casuale);
        }
        return pizza.trim();
    }

    /*public static void main(String[] args) {
        System.out.println(Generatori.GeneraPizze());
    }*/
}
