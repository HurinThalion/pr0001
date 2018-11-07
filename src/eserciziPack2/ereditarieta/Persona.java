package eserciziPack2.ereditarieta;

public  class Persona {

    private String nome;
    private String cognome;
    private String cf;
    private String telefono;

    public Persona() {}
    public Persona(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.setCf(cf);
        //this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        if(cf.length() == 16)
            this.cf = cf;
        else
            System.out.println("Attenzione, cf sbagliato");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", cf='" + cf + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
