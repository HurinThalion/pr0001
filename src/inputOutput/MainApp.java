package inputOutput;

import java.io.*;

public class MainApp {

    public static void main(String[] args) throws Exception {

        //pattern decoretor..una classe accetta oggetto ed
        //aggiunge funzionalità poi ritorna quell'oggetto
        //esempio della bevanda
        //reader e writer per character stream (blocchi da 16bit)
        //inputstream e outputstream per byte stream (blocchi da 8bit)

        File tesi = new File("./resources/./tesi.txt");
        File folder = new File("/resources");

        //i punti sono movimenti nelle cartelle....il canon le toglie
//        System.out.println("getname " + tesi.getName());
//        System.out.println("ap " + tesi.getAbsolutePath());
//        System.out.println("af " + tesi.getAbsoluteFile());
//        System.out.println("cf " + tesi.getCanonicalFile());
//        System.out.println("cp " + tesi.getCanonicalPath());

        if(tesi.exists()) {
            System.out.println("esisto");
        }else {
            System.out.println("non esisto ma mi creo");
            if(!tesi.createNewFile()) {
                System.out.println("errore nella creazione");
            }
        }

        // il try with resource chuide in automatico perchè clousable
        try(//InputStream is = new FileInputStream(tesi);
            OutputStream os = new FileOutputStream(tesi)) {

            os.write("Poggers DOOOOODE\n".getBytes());
            os.write("Lets go DOOOOODE\n".getBytes());
            os.flush();
            System.out.println("scritto");
            Thread.sleep(1500);
            FileReader fr = new FileReader(tesi);//apre l'inputstream da solo
           // Reader r = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(fr);
            String a = "";
            int n = 0;
            while((a = br.readLine()) != null) {
                n++;
                System.out.println(n + " " + a);
            }
        }
    }
}

