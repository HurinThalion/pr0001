package esercizi8;

import Eccezioni.DivByZeroException;

import java.util.Scanner;

public class MainAppEs8 {

    public static void main(String[] args) {


        System.out.println("dividi sto numero " + 12);
        double ris = 0;
        try {
            ris = dividi(12);
        } catch (DivisionePerZeroException e) {

        }
        System.out.println(ris);
        System.out.println("Programam terminato correttamente!");



    }

    public static double dividi(double d1) throws DivisionePerZeroException{

        double ris = 0;
        System.out.println("Scrivi il divisore : ");
        Scanner s = new Scanner(System.in);
        double div = s.nextDouble();

        try {
            if(div == 0)
                throw new DivisionePerZeroException();
            ris = d1 / div;
        }catch (DivisionePerZeroException d) {
            ris = dividi(d1);
        }

        return ris;
    }
}
