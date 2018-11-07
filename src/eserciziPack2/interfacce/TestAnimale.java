package eserciziPack2.interfacce;

public class TestAnimale {
    public static void main(String[] args) {

        Object cat = new Gatto("siamese", 4);
        Elefante elephant = new Elefante("Africano");

        Saltante[] jumper = new Saltante[] {(Saltante) cat};

        for(Saltante s : jumper) {
            s.salta();
        }
    }
}
