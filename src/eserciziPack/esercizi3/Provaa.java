package eserciziPack.esercizi3;

//realizzare ed implementare un enum che rappresenti il formato dei file accettati
//durante la fase di caricamento da un sito
//ogni formato file avrà una sua sottocartella di memorizzazione,
//un suo limite massimo di peso espresso in kB
//e dei metodi per ottenere queste infomrazioni

//logica sbagliata, i set non hanno senso nelle enum

public enum Provaa {

    MP3() {

        private int sizeMP3;

        @Override
        public int getSize() {
            return this.sizeMP3;
        }

        @Override
        public void setSize(int size) {
            if(size <= 10000) {
                this.sizeMP3 = size;
            }else {
                System.out.println("Grandezza file non accettata");
            }
        }

        @Override
        public String toString() {
            return "{ " + name() + "( "
                    + this.getSize() + " )" + " }";
        }

    },
    MP4() {

        private int sizeMP4;

        @Override
        public int getSize() {
            return this.sizeMP4;
        }

        @Override
        public void setSize(int size) {
            if(size <= 50000) {
                this.sizeMP4 = size;
            }else {
                System.out.println("Grandezza file non accettata");
            }
        }

        @Override
        public String toString() {
            return "{ " + name() + "( "
                    + this.getSize() + " )" + " }";
        }
    },
    JPEG() {

        private int sizeJPEG;

        @Override
        public int getSize() {
            return this.sizeJPEG;
        }

        @Override
        public void setSize(int size) {
            if(size <= 3000) {
                this.sizeJPEG = size;
            }else {
                System.out.println("Grandezza file non accettata");
            }
        }

        @Override
        public String toString() {
            return "{ " + name() + "( "
                    + this.getSize() + " )" + " }";
        }

    },
    PNG() {

        private int sizePNG;

        @Override
        public int getSize() {
            return this.sizePNG;
        }

        @Override
        public void setSize(int size) {
            if(size <= 4000) {
                this.sizePNG = size;
            }else {
                System.out.println("Grandezza file non accettata");
            }
        }

        @Override
        public String toString() {
            return "{ " + name() + "( "
                    + this.getSize() + " )" + " }";
        }

    },
    PDF() {

        private int sizePDF;

        @Override
        public int getSize() {
            return this.sizePDF;
        }

        @Override
        public void setSize(int size) {
            if(size <= 8000) {
                this.sizePDF = size;
            }else {
                System.out.println("Grandezza file non accettata");
            }
        }

        @Override
        public String toString() {
            return "{ " + name() + "( "
                    + this.getSize() + " )" + " }";
        }

    };

    private int size;

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
