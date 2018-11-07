package eserciziPack3.giocoCarte;

import java.util.List;

public class GiocoCarteApp {

    public static void main(String[] args) {

        System.out.println("Queste sono le carte : ");
        List<String> c = GiocoCarteMetodi.getCarte();
        int i = 0;
        for(String s : c) {
            System.out.print("(posizione "+ i + " : " + s + ")\t\t");
            i++;
        }

        GiocoCarteMetodi.scegli();

    }
}
