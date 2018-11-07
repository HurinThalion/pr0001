package eserciziPack.esercizi6;

public class Band {

    private String nome;
    private Chitarrista[] chitarrista = new Chitarrista[1];
    private Bassista[] bassista = new Bassista[1];

    public Band(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public Chitarrista[] getChitarrista() {
        return chitarrista;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setChitarrista(Chitarrista chitarrista) {

        Chitarrista[] c = new Chitarrista[this.chitarrista.length + 1];
        if(this.chitarrista[0] == null)
            this.chitarrista[0] = chitarrista;
        else {
            for (int i = 0; i < this.chitarrista.length; i++) {
                c[i] = this.chitarrista[i];
            }
            c[c.length - 1] = chitarrista;
            this.chitarrista = c;
        }
    }

    public Bassista[] getBassista() {
        return bassista;
    }

    public void setBassista(Bassista bassista) {

        Bassista[] b = new Bassista[this.bassista.length + 1];
        if(this.bassista[0] == null)
            this.bassista[0] = bassista;
        else {
            for (int i = 0; i < this.bassista.length; i++) {
                b[i] = this.bassista[i];
            }
            b[b.length - 1] = bassista;
            this.bassista = b;
        }
    }
}
