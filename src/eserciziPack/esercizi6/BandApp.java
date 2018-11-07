package eserciziPack.esercizi6;

//avrei potuto fate una classe abstract musicista e farla estendere a chitarrista ecc.
//così da scrivere solo una volta i vatri attributi e metodi che ho ripetuto per ogni
//ruolo nella band

public class BandApp {

    public static void main(String[] args) {

        Band b = new Band("Opeth");
        Band ba = new Band("Wintersun");
        Chitarrista c = new Chitarrista("Mikael", 44);
        Chitarrista ch = new Chitarrista("Jari", 43);
        Bassista bass = new Bassista("Martin");
        b.setChitarrista(c);
        ba.setChitarrista(ch);
        b.setBassista(bass);
        c.setBand(b);
        ch.setBand(ba);
        bass.setBand(b);
        System.out.println(b.getChitarrista()[0].getNome());
        System.out.println(ba.getChitarrista()[0].getNome());
        System.out.println(b.getBassista()[0].getNome());
        System.out.println(c.getBand().getNome());
        System.out.println(ch.getBand().getNome());
        System.out.println(bass.getBand().getNome());
        System.out.println(c.ruolo + " " + c.getBand().getNome());
        System.out.println(ch.ruolo + " " + ch.getBand().getNome());
        System.out.println(bass.ruolo + " " + bass.getBand().getNome());
    }
}
