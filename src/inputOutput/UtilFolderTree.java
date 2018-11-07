package inputOutput;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static inputOutput.esFolderTree.pog;

public class UtilFolderTree {

    static private Path pathdest = Paths.get("./tree.txt");
    static private BufferedWriter br;
    static private int cont = 0;

    static {
        try {
            br = Files.newBufferedWriter(pathdest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void scriviTree(Path p) throws IOException {

        Stream<Path> files = Files.list(p);

        files.forEach(ph -> {
            try {
                if(pog >= ph.getNameCount()) {
                    System.out.println("qualcuno ha modificato il pog in modo malevolo! " +
                            "Esco dal programma");
                    System.exit(-1);
                }
                cont = ph.getNameCount() - pog;
                String[] str = new String[cont];
                for(String s : str) {
                    s = " -- ";
                    br.write(s);
                }
                br.write(ph.getFileName().toString() + "\n");
                br.flush();
                if(Files.isDirectory(ph)) {
                    scriviTree(ph);
                }
            } catch (IOException e) {
                System.out.println("errore mentre creo l'albero delle cartelle");
            }

        });
    }
}
