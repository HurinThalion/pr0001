package Eccezioni;

public class Prove1 {

    public static void main(String[] args) {

        int x = 3;
        int y = 0;
        double r = 0;

        try {
            r = blackbox(x, y);
        }catch (DivByZeroException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(r);
    }

    public static double blackbox(int d, int f) throws DivByZeroException {
        double tmp = 0;
        if(f == 0)
            throw new DivByZeroException("Errore DivByZero");
        tmp = d / f;
        return tmp;
    }
}
