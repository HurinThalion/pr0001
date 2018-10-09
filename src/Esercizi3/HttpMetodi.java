package Esercizi3;

//enum implementa inerfacce e deve per forza implementare tutti i metodi
//visto che non si può estendere

public enum HttpMetodi {

    GET(10100),
    POST(10200),
    PULL(10300),
    DELETE(10400),
    OPTION(10400),
    PATCH(10500) {
        @Override
        public String toString() {
            return "{ " + name() + "( "
                    + " )" + " }";
        }
    };

    private int code;

    private HttpMetodi(int code) {
        this.code = code;
    }  //private ridondante nelle enum

    public int getCode() {
        return this.code;
    }

    @Override
    public String toString() {
        return "{ " + name() + "( "
                + this.getCode() + " )" + " }";
    }
}
