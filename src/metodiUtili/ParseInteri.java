package metodiUtili;

import static metodiUtili.LeggiDaTastiera.leggiStringa;

public class ParseInteri {

    public static int parseIntero(String s) {
        for (int i = 0; i < s.length(); i++) {
            String x = "" + s.charAt(i);
            if (i == 0 && x.equals("+") || x.equals("-")) continue;
            if (x.charAt(0) >= 48 && x.charAt(0) <= 57) {
                return Integer.parseInt(s);
            } else {
                break;
            }
        }
        System.out.println("Inserire stringa valida : ");
        String snew = leggiStringa();
        return parseIntero(snew);
    }
}

