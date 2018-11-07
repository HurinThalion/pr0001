package eserciziPack.esercizi4;

public class Anonymous {

    interface myInterface {
        public void doStuff(int x);
    }
    static class TestInterface implements myInterface {
        @Override
        public void doStuff(int x) {

        }
    }



    public static void main(String[] args) {

        myInterface m = new TestInterface();
        myInterface m1 = new myInterface() {
            @Override
            public void doStuff(int x) {

            }
        };

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Ciao dal thread");
            }
        });

       int giri = 5;

       /*myInterface m3 = (5) -> {

           for (int i = 0; i < 6; i++) {
               System.out.println(i);
           }
       };*/

        Runnable t3 = () -> {

            for (int i = 5; i > 0; i--) {
                System.out.println(i);
            }
        };

        t1.start();
    }
}
