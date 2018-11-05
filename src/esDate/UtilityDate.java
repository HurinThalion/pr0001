package esDate;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class UtilityDate {

    public static String scrivi() {

        Scanner s = new Scanner(System.in);

        String dest = s.nextLine();

        return dest;
    }

    public static void orario(String arrivo) {

        LocalDateTime ldt = LocalDateTime.now();
        if(arrivo.equalsIgnoreCase("milano-roma")) {
            calcola("Europe/Rome", "Europe/Rome", 1);
        }else if(arrivo.equalsIgnoreCase("milano-londra")) {
            calcola("Europe/Rome", "Europe/London", 1);
        }else if(arrivo.equalsIgnoreCase("milano-parigi")) {
            calcola("Europe/Rome", "Europe/Paris", 1);
        }else if(arrivo.equalsIgnoreCase("roma-londra")) {
            calcola("Europe/Rome", "Europe/London", 2);
        }else if(arrivo.equalsIgnoreCase("roma-parigi")) {
            calcola("Europe/Rome", "Europe/Paris", 2);
        }else if(arrivo.equalsIgnoreCase("londra-parigi")) {
            calcola("Europe/London", "Europe/Paris", 1);
        }
    }

    private static void calcola (String fusorarioPar, String fusorarioArr, int tempo){

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //PARTENZA
        LocalDateTime leaving = LocalDateTime.now();
        ZoneId leavingZone = ZoneId.of(fusorarioPar);
        ZonedDateTime departure = ZonedDateTime.of(leaving, leavingZone);

        try {
            String out1 = departure.format(format);
            System.out.println("Partenza : " + out1 + " | " + leavingZone);

        } catch (DateTimeException e) {
            System.out.println("Non formattato " +  departure);
            throw e;
        }

        //ARRIVO
        ZoneId arrivingZone = ZoneId.of(fusorarioArr);
        ZonedDateTime arrival = departure.withZoneSameInstant(arrivingZone).plusHours(tempo);

        try {
            String out2 = arrival.format(format);
            System.out.println("ARRIVO: " + out2 + " | " + arrivingZone);

        } catch (DateTimeException exc) {
            System.out.println("Non formattato " + arrival);
            throw exc;
        }
    }
}
