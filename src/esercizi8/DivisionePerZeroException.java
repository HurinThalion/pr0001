package esercizi8;

public class DivisionePerZeroException extends Exception {

    public DivisionePerZeroException() {
        System.out.println("Hai provato a dividere per zero!");
    }

    public DivisionePerZeroException(String s) {
        System.out.println(s);
    }
}
