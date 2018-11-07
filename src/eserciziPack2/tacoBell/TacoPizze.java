package eserciziPack2.tacoBell;

//da fixare sto spaghetti eserciziPack2.codeEnonSolo
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TacoPizze {

    private static List<String> foodname = new ArrayList<>();
    private static List<String> adjective = new ArrayList<>();
    private static List<String> postfix = new ArrayList<>();
    private static Random r = new Random();
    private static String str = "{ ";

    public static void addFoodname() {
        foodname.add("Margherita ");
        foodname.add("Prosciutto ");
        foodname.add("Diavola ");
        foodname.add("Salmone ");
        foodname.add("Funghi ");
        foodname.add("Americana ");
        foodname.add("Misteriosa ");
        foodname.add("Amalfitana ");
    }

    public static void addAdjective() {
        adjective.add("Buona ");
        adjective.add("Bella ");
        adjective.add("Brava ");
        adjective.add("Calda ");
        adjective.add("Piccante ");
        adjective.add("Salata ");
        adjective.add("Incredibile ");
        adjective.add("Schifosa ");
    }

    public static void addPostfix() {
        postfix.add("Patatine ");
        postfix.add("Insalata ");
        postfix.add("Cetrioli ");
        postfix.add("Peperoni ");
        postfix.add("Salsa ");
        postfix.add("Maionese ");
        postfix.add("Bufala ");
        postfix.add("Segreto ");
    }

    //genera da solo foodname.size() numero di pizze e stampa non salva
    public static void genera() {

        for(int i = 0; i < foodname.size(); i++) {

            int tmp = r.nextInt(foodname.size());
            System.out.print("-Pizza : " + foodname.get(tmp) + "\t");

            tmp = r.nextInt(adjective.size());
            System.out.print("-Considerazione : " + adjective.get(tmp) + "\t");

            tmp = r.nextInt(postfix.size());
            int tmp1 = r.nextInt(postfix.size());
            if(tmp1 < 3)
                System.out.println("-Aggiunta : " + postfix.get(tmp) + "\t");
            else
                System.out.println("");
        }
    }
    //metodo farlocco
    public static void genera(int x) {

        for(int i = 0; i < x; i++) {

            int tmp = r.nextInt(foodname.size());
            System.out.print("-Pizza : " + foodname.get(tmp) + "\t");

            tmp = r.nextInt(adjective.size());
            System.out.print("-Considerazione : " + adjective.get(tmp) + "\t");

            tmp = r.nextInt(postfix.size());
            int tmp1 = r.nextInt(postfix.size());
            if(tmp1 < 3)
                System.out.println("-Aggiunta : " + postfix.get(tmp) + "\t");
            else
                System.out.println("");
        }
    }
    //genera con un while nel main tante pizze qaunte ne vuole l'utente
    //con o senza aggiunta in base al volere dell'utente (solo stampa)
    public static void genera(int x, String s) {

        for(int i = 0; i < x; i++) {

            int tmp = r.nextInt(foodname.size());
            System.out.print("-Pizza : " + foodname.get(tmp) + "\t");

            tmp = r.nextInt(adjective.size());
            System.out.print("-Considerazione : " + adjective.get(tmp) + "\t");

            tmp = r.nextInt(postfix.size());
            if(s.equalsIgnoreCase("aggiunta"))
                System.out.println("-Aggiunta : " + postfix.get(tmp) + "\t");
            else
                System.out.println("");
        }
    }
    //farlocco
    public static String generaESalva() {

        String str = "";
        for(int i = 0; i < 1; i++) {

            int tmp = r.nextInt(foodname.size());
            str += foodname.get(tmp);

            tmp = r.nextInt(adjective.size());
            str += adjective.get(tmp);

            tmp = r.nextInt(postfix.size());
            int tmp1 = r.nextInt(postfix.size());
            if(tmp1 < 3)
                str += postfix.get(tmp);
            else
                System.out.println("");
        }

        return str;
    }
    // genera con un while nel main come il genera(int x, String s) ma salva
    public static String generaESalva(String s) {


        for(int i = 0; i < 1; i++) {

            int tmp = r.nextInt(foodname.size());
            str += "-Pizza : " + foodname.get(tmp) + ", ";

            tmp = r.nextInt(adjective.size());
            str += "-Considerazione : " + adjective.get(tmp) + " ,";

            tmp = r.nextInt(postfix.size());
            if(s.equalsIgnoreCase("aggiunta"))
                str += "-Aggiunta : " + postfix.get(tmp) + " ,";
            else
                System.out.println("");
        }
        return str + " }";
    }

    public static String getStr() {
        return str;
    }
}
