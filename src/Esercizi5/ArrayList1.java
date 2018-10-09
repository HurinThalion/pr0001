package Esercizi5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ArrayList1 {

    public static void main(String[] args) {

        List<Auto> macchine = new ArrayList();

        int c = 1;
        for(int i = 0; i < 10; i++) {
            Auto m = new Auto(ChiamaAuto.getModello());
            macchine.add(m);
        }

        for(Auto a : macchine) {
            System.out.println(a); //non serve il toString()
        }

        macchine.sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto a1, Auto a2) {

                if(a1.getVelocità() > a2.getVelocità()) {
                    return 1;
                }
                else if(a1.getVelocità() == a2.getVelocità()){
                        if(a1.getPeso() > a2.getPeso())
                            return 1;
                        else if(a1.getPeso() == a2.getPeso())
                            return 0;
                        else {
                            if(a1.getPeso() < a2.getPeso())
                                return -1;
                    }
                    return 0;
                }else {
                    if(a1.getVelocità() < a2.getVelocità()) {
                        return -1;
                    }
                }
                return 0;
            }
        });

        System.out.println("");
        for(Auto a : macchine) {
            System.out.println(a);
        }
    }
}
