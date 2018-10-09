package Esercizi5;

public class MainCifrario {

    public static void main(String[] args) {

        Cifratore c = Cifratore.getCifratore();
        String kappa = c.cifraParola("Pippo");
        System.out.println("La parola crittata : " + kappa);
        kappa = c.decifraParola(kappa);
        System.out.println("La parola decifrata è : " + kappa);

    }
}
