package eserciziPack.esercizi3;

public class ProvaaMain {

    public static void main(String[] args) {

        //Provaa p = Provaa.valueOf("MP3");

        Provaa mp3 = Provaa.MP3;
        Provaa mp4 = Provaa.MP4;
        Provaa jpeg = Provaa.JPEG;
        Provaa png = Provaa.PNG;
        Provaa pdf = Provaa.PDF;

        mp3.setSize(300);
        System.out.println(mp3);
        mp3.setSize(30000);
        System.out.println(mp3);

        mp4.setSize(5000);
        System.out.println(mp4);
        mp4.setSize(60000);
        System.out.println(mp4);

        jpeg.setSize(100);
        System.out.println(jpeg);
        jpeg.setSize(6000);
        System.out.println(jpeg);

        png.setSize(200);
        System.out.println(png);
        png.setSize(8000);
        System.out.println(png);

        pdf.setSize(90);
        System.out.println(pdf);
        pdf.setSize(10000);
        System.out.println(pdf);

        System.out.println(mp3.getSize());
        //System.out.println(p);
    }
}
