package esDate;

import java.util.Locale;
import java.util.ResourceBundle;

public class MainLang {

    public static void main(String[] args) {

        //sempre lingua minuscola prima e regione maiuscolo dopo
        Locale canada = new Locale("fr", "CA");

        Locale defaultLang = null;
        //System.getProperties().forEach((a, b) -> System.out.println(a+" : "+b));
        defaultLang = new Locale(System.getProperty("user.language"),
                System.getProperty("user.country"));
        System.out.println(defaultLang);
        defaultLang = Locale.getDefault();
        System.out.println(defaultLang);


        ResourceBundle r = ResourceBundle.getBundle("test_", defaultLang!=null?defaultLang:Locale.CHINA);
        System.out.println(r.getString("home.titolo"));

    }
}
