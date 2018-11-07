package eserciziPack2.codeEnonSolo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class EsempioCode {

    public static void main(String[] args) {



        /*Queue<Integer> codaInteger = new LinkedList<>();

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Scrivi numero  " + (i + 1) + " ");
            int tmp = leggiInt();
            codaInteger.offer(tmp);
        }

        System.out.println(codaInteger);
        //FIFO
        while(codaInteger.peek() != null) {
            System.out.println("Estratto numero : " + codaInteger.poll());
            System.out.println(codaInteger);
        }

        System.out.println(codaInteger);

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Scrivi numero  " + (i + 1) + " ");
            int tmp = leggiInt();
            codaInteger.offer(tmp);
        }


        //se fosse deque non servirebbe il casting
        while(codaInteger.peek() != null) {
            System.out.println("Estratto numero : " + ((LinkedList<Integer>) codaInteger).removeLast());
            System.out.println(codaInteger);
        }*/


        //System.runFinalization();//ultimo desiderio
        //System.getProperties();
        //System.getenv();//mappa con variabili di sistema
        Map<String, String> mappaE = System.getenv();
        Set<String> keyss = mappaE.keySet();
        for(String k : keyss) {
            System.out.println(k + " " + mappaE.get(k));
        }

        String destinazione = mappaE.get("USERPROFILE") + "\\Desktop";
        /*File file = new File(destinazione + "\\gjgjgjgjgj.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write("ciao");
            fw.flush();
            fw.close();
            }catch (IOException i) {
                i.printStackTrace();
            }*/

        File file = new File(destinazione + "\\gjgjgjgjgjf.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            for(String s : keyss) {
                fw.write(  s + " : " + mappaE.get(s) + System.lineSeparator());
            }
            fw.flush();
            fw.close();
        }catch (IOException i) {
            i.printStackTrace();
        }

        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("----------------------------");

        Properties prop = System.getProperties();
        prop.list(System.out);
        File f2 = new File(destinazione + File.separator + "pros.txt");

        try {
            FileWriter fww = new FileWriter(f2, false);
            prop.list(new PrintWriter(fww));//decoration è un pattern
            fww.flush();
            fww.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
