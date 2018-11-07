package eserciziPack.esercizi2;

public class ListaDinamica {

    private String[] db;
    private int[] mm;

    public ListaDinamica() {
        this.db = new String[1];
        this.mm = new int[1];
    }

    public String[] getDb() {
        return this.db;
    }
    public int[] getMm() {
        return this.mm;
    }

    public void add(String s) {
        //todo
        if(db[db.length -1] == null) {
            db[db.length - 1] = s;
        }else {
            String[] tmp = new String[db.length + 1];
            for(int i = 0; i < db.length; i++) {
                tmp[i] = db[i];
            }
            //tmp[db.length] = s;
            db = tmp;
            add(s);
        }
    }

    public void stampaContenuto() {
        //todo
        for(int i = 0; i < db.length; i++) {
            System.out.print(db[i] + "\t");
        }
        System.out.println("");
    }

    public void stampaContenutoRovesciato() {
        for(int i = db.length - 1; i >= 0; i--) {
            System.out.print(db[i] + "\t");
        }
        System.out.println("");
    }

    public void add(int l) {
        //todo
        if(mm[mm.length -1] == 0) {
            mm[mm.length - 1] = l;
        }else {
            int[] tmp = new int[mm.length + 1];
            for(int i = 0; i < mm.length; i++) {
                tmp[i] = mm[i];
            }
            //tmp[db.length] = s;
            mm = tmp;
            add(l);
        }
    }

    public void stampaContenutoInt() {
        //todo
        for(int i = 0; i < mm.length; i++) {
            System.out.print(mm[i] + "\t");
        }
        System.out.println("");
    }

    public void stampaContenutoRovesciatoInt() {
        for(int i = mm.length - 1; i >= 0; i--) {
            System.out.print(mm[i] + "\t");
        }
        System.out.println("");
    }

    public void addPlus(String s) {
        if(db[db.length - 1] == null) {
            db[db.length - 1] = s + ". ";
        }else {
            String[] tmp = new String[db.length + 1];
            for(int i = 0; i < db.length; i++) {
                tmp[i] = db[i];
            }

            tmp[db.length] = s + ". ";
            db = tmp;
            //addPlus(s);
        }
    }

    public double mediaTemp(int[] x) {

        double k = 0;

        for(int i : x) {
            k = (double) (k + i);
        }
        return k / x.length;
    }

}
