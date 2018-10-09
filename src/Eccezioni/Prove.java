package Eccezioni;

public class Prove {
    public static void main(String[] args) {

        int x = 3;
        int y = 0;
        double r = 0;

        try {
            if(y == 0)
                throw new DivByZeroException("Errore DivByZero");
            r = x / y;
        }catch (DivByZeroException e) {
            System.out.println(e.getMessage());
            System.out.println("divisione per zero");
        }catch (Exception e) {
            System.out.println("Ma che davero?");
        }finally {
            System.out.println("PogChamp");
        }
    }
}
