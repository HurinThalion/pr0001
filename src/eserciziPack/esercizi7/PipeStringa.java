package eserciziPack.esercizi7;

public class PipeStringa {

    public static void main(String[] args) {

        String str = "Sviluppare un applicativo che permetta di suddividere una stringa di testo in parti delimitate da un carattere speciale e ottenere tutte queste parti all’interno di un array (non usare List). ";
        String[] arrs = new String[str.length()];
        String strf = "";

        for(int i = 0; i < str.length(); i++) {
            arrs[i] = str.charAt(i) + "";
            if(str.charAt(i) == ' ')
                arrs[i] = " " + '|' + " ";
        }

        System.out.println("Stringa iniziale : \n" + str);

        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");

        System.out.println("Dopo la modifica : ");
        for(int i = 0; i < arrs.length; i++)
            strf = strf + arrs[i];

        System.out.println(strf + "\n");

        System.out.println("Ora salvo in un array i vari token suddivisi da | : ");
        String[] risf = new String[strf.length()];
        divisione(strf, risf);
        for(int i = 0; i < risf.length; i++) {
            if(risf[i] != null)
                System.out.print(risf[i] + " <- pos " + i + "//");
        }
        System.out.println("");

    }
    //quello di vALERIO è PIù GENERICO..IL MIO OBBLIGA a delle restrizioni
    //potrei passare il char come parametro e tolgiere l'array per crearlo dentro al metodo
    public static void divisione(String s, String[] arr) {

        String tmp = "";
        int c = 0;

        for(int i = 0; i < s.length(); i++) {
            tmp = tmp + s.charAt(i);
            if(s.charAt(i) == '|') {
                arr[c] = tmp;
                c++;
                tmp = "";
            }
        }
    }
}
