package eserciziPack.esercizi;

public class Elenco {

    private String[] db;
    private int pos;
    private boolean isInt; //true per interi, false per stringhe

    public Elenco(int lunghezza, boolean intero) {
        this.db = new String[lunghezza];
        this.pos = 0;
        this.isInt = intero;
    }

    public boolean addItem(String item) {
        if (isInt && !isNumero(item))
            return false;
        if (this.pos < this.db.length) {
            this.db[pos] = item;
            pos++;
            return true;
        }
        return false;
    }

    public String[] getItem() {
        return this.db;
    }

    public String getItem(int pos) {
        if (pos >= 0 && pos < this.db.length)
            return this.db[pos];
        else
            return "";
    }

    public int getIntItem(int pos) {
        if (pos >= 0 && pos < this.db.length) {
            return Integer.parseInt(this.db[pos]);
        } else {
            return 0;
        }
    }

    private boolean isNumero(String item) {
        boolean isNumero = true;
        for (int i = 0; i < item.length(); i++) {
            String x = "" + item.charAt(i);
            if (i == 0 && x.equals("+") || x.equals("-")) continue;
            if (x.charAt(0) >= 48 && x.charAt(0) <= 57) {
                return true;
            } else {
                isNumero = false;
                break;
            }
        }
        return false;
    }
}
