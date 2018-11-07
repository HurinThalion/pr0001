package inputOutput;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class esFolderTree {

    static int pog = 0;

    public static void main(String[] args) {

        Path path = Paths.get("C:\\academy\\pr0001\\src");
        pog = path.getNameCount();

        try {
            UtilFolderTree.scriviTree(path);
            System.out.println("Albero delle cartelle creato correttamente!");
        } catch (IOException e) {
            System.out.println("percorso non valido");
        }

    }
}
