package Eccezioni;

public class DivByZeroException extends Exception {

    public DivByZeroException() {}
    public DivByZeroException(String s) {
        super(s);
    }
}
