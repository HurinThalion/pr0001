package eserciziPack.esercizi5;


public enum CartaSassoForbice {

    CARTA(0),
    SASSO(1),
    FORBICE(2);

    private int code;

    CartaSassoForbice(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static int rgen() {
        int d =(int) (Math.random() * 3);
        return d;
    }
}
