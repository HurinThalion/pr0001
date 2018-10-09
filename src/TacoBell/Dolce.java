package TacoBell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Dolce {
    public static String genera(){
        Random r = new Random();
        List<String> dolci = (Arrays.asList("Torta", "Cupcake", "Crostata","Muffin","Ciambella", "Biscotti"));


        List<String> ripieno = new ArrayList<>(Arrays.asList("crema","fragola","albicocca","cioccolato","panna","mandorle","nocciola","arachidi"));

        String dolce = "";
        dolce += dolci.get(r.nextInt(dolci.size()));
        int n = r.nextInt(4);
        int tmp;

        for(int i=0; i<n;i++){

            tmp = r.nextInt(ripieno.size());
            dolce +=  " " + ripieno.get(tmp);
            ripieno.remove(tmp);
        }
        return dolce;

    }
}
