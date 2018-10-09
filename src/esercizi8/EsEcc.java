package esercizi8;

public class EsEcc {

    public static void metodoChecked() throws Exception {
        double d = 2/0;
    }

    public static void metodoUnchecked() throws Error {

    }
}

class MainExApp {

    public static void main(String[] args) {

        try {
            EsEcc.metodoChecked();
        } catch (Exception e) {
            e.printStackTrace();
        }
        EsEcc.metodoUnchecked();

    }
}