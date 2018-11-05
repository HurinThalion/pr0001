package esDate;

import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MainDate {

    public static void main(String[] args) {


        /*
        Date d1 = new Date(System.currentTimeMillis());
        System.out.println(d1);
        Calendar c1 = new GregorianCalendar();
        //System.out.println(c1);
        System.out.println(c1.getTime());
        */
        //--------date e calendar sono deprecate..adesso c'è time poggers--------
        //tutto il package java.time è immutabile...non si possono istanziare oggetti
/*
        LocalDate ld1 = LocalDate.now();
        //System.out.println(ld1);
        LocalDateTime ldt1 = LocalDateTime.now();
        //System.out.println(ldt1);
        LocalTime lt1 = LocalTime.now();
        //System.out.println(lt1);
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/YYYY", Locale.ITALY);
        //System.out.println("-----");
        //System.out.println(ldt1.format(dtf1));
        //System.out.println(dtf1.format(ldt1));
        ldt1 = ldt1.plusDays(2).plusHours(5);
        //System.out.println(ldt1.format(DateTimeFormatter
                //.ofPattern("EEE\tdd/MM/YYYY HH:mm:ss", Locale.ENGLISH)));
        LocalDate ld2 = LocalDate.of(2018, Month.NOVEMBER, 5);
        LocalDate ld3 = LocalDate.of(2018, 11, 5);
        //System.out.println(ld2.isEqual(ld3));

        LocalDateTime ldtNow1 = LocalDateTime.now();
        System.out.println(ldtNow1.until(ldt1, ChronoUnit.MINUTES));
        Period p1 = Period.ofDays(7);
        Period p2 = Period.ofWeeks(1);
        System.out.println(Period.between(ldtNow1.toLocalDate(), ldt1.toLocalDate()));
*/

        LocalDate myBirth = LocalDate.of(1995, 12, 22);
        LocalDateTime ldtNow = LocalDateTime.now();
        for (LocalDate date = myBirth; date.isBefore(ldtNow.toLocalDate());
             date = date.plusYears(1)) {

            System.out.println("Giorno del mio compleanno : " + " nel " + date.getYear()
                    + " era " +
                    date.getDayOfWeek());

        }

        LocalDateTime myBirth2 = LocalDateTime.of(myBirth, LocalTime.now());
        System.out.println("Secondi di eta : " + myBirth2.until(ldtNow, ChronoUnit.SECONDS));

        int d = (int) myBirth2.until(ldtNow, ChronoUnit.SECONDS);
        System.out.println("Secondi in anni per essere sicuri : " + d/60/60/24/365 + " anni");

    }
}
