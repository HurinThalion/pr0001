package codeEnonSolo;

import java.io.IOException;

public class RuntimeApp {

    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        try {
            r.exec("calc");
        } catch (IOException e) {
            System.err.println("NON supportato");
        }

        System.out.println(r.freeMemory());
        System.out.println(r.availableProcessors());
        System.out.println(r.totalMemory());
        //r.exit(3);
    }
}
