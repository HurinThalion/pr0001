package eserciziPack.esercizi7;

public class PipeValerio {

    public static void main(String[] args) {

        String testo = "AHDHDHD sjddjdj | hfhfjdj | hfhfjdkdkd dhdjfjfk | gfgfgf.";
        String[] parte = splitta(testo, '|');
        for(String p : parte) {
            System.out.println(p);
        }

    }

    public static String[] splitta(String txt) {
        return splitta(txt, ' ');
    }

    public static String[] splitta(String txt, char s) {

        String[] tmp;
        int x = 0;

        //conto le parti da dividere
        for(int i = 0; i < txt.length(); i++) {
            if(txt.charAt(i) == s)
                x++;
        }

        if(x == 0) {
            return new String[]{"Non c'è"};
        }
        tmp = new String[x + 1];
        int posI = 0;
        int posF = 0;

        for (int i = 0; i < tmp.length; i++) {
            posF = txt.indexOf(s);
            if(posF >= 0) {
                String tmptxt = txt.substring(posI, posF);
                tmp[i] = tmptxt;
                txt = txt.substring(posF + 1);
            }
            else
                tmp[i] = txt;

        }
        return tmp;

    }
}
