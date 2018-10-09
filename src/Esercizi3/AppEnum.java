package Esercizi3;

public class AppEnum {

    enum Formati {CSV, TXT};

    public static void main(String[] args) {

        String extension = "csv";
        Formati formato_file = Formati.valueOf(extension.toUpperCase());

        HttpMetodi metodo_chiamata = HttpMetodi.POST;
        //HttpMetodi metodo_chiamata1 = HttpMetodi.PATCH;

        if(metodo_chiamata instanceof Object) {
            System.out.println("enum è un object!");
        }

        if(metodo_chiamata instanceof HttpMetodi) {
            System.out.println("enum è un'instanza di HttpMetodi");
        }

        if(HttpMetodi.GET == metodo_chiamata) {

        }else {

        }

        System.out.println(metodo_chiamata);
        //System.out.println(metodo_chiamata1);
        System.out.println(HttpMetodi.PATCH);

        test(null);

        if(formato_file == Formati.CSV) {
            System.out.println(Formati.CSV);
        }

        Formati  kk = Formati.CSV;
        Formati  kk1 = Formati.TXT;
        int s = kk.ordinal();
        int s1 = kk1.ordinal();
        System.out.println(s);
        System.out.println(s1);

    }

    public static void test(HttpMetodi metodo) {
        System.out.println(metodo);
    }
}
