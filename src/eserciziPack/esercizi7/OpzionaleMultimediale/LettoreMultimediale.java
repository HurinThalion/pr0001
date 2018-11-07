package eserciziPack.esercizi7.OpzionaleMultimediale;

import java.util.ArrayList;
import java.util.List;

public class LettoreMultimediale {

    private static LettoreMultimediale ourInstance = new LettoreMultimediale();
    private static List<ElementoMultimediale> lista = new ArrayList<>();

    public static LettoreMultimediale getInstance() {
        return ourInstance;
    }

    private LettoreMultimediale() {
    }


}
