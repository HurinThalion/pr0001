package eserciziPack.esercizi;

public class Operatori {
    //public static int x = 3;
    public static void main(String args[]) {
        boolean v = true;
        int x = 3;
        int y = 5, z = 8;
        /*if(v == true | logga(x)) {
            System.out.println("vero");
        }
        System.out.println(x);*/

        /*for(;;){
            if(x < 1) {break;} else {
                x--;
                continue;
            }
        }*/
        //no virgola mobile
        switch(x) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            default:
                System.out.println("-1");
        }
    }

    public static boolean logga(int x) {
        System.out.println("x vale : " + x++);
        return true;
    }
}
