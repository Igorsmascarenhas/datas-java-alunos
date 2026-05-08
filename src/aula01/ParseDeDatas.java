package aula01;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseDeDatas {
    public static void main(String[] args) {
        // Parse
        LocalDate date01 = LocalDate.now();
        System.out.println("date 01 - " + date01);

        LocalDate date02 = LocalDate.parse("2025-05-10");
        System.out.println("date 02 - " + date02);

        LocalDateTime date03 = LocalDateTime.parse("2025-05-10T14:00:00");
        System.out.println("date03 - " + date03);

        Instant instant = Instant.parse("2025-05-10T14:00:00-03:00");
        System.out.println( "instant - "+ instant);

//        y       year
//        M    month
//        d       day
//        H       hour
//        m       minute
//        s       second

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date04 = LocalDate.parse("20/05/2026", formatter1);
        System.out.println("date04 - " + date04);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd_MM_yy");
        LocalDate date05 = LocalDate.parse("20_05_26", formatter2);
        System.out.println("date05 - " + date05);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yy_HH:mm");
        LocalDateTime date06 = LocalDateTime.parse("20/05/26_14:30", formatter3);
        System.out.println(date06);

        // "20/05/26 14:30:12"                          - ISO 8601 - ano-mes-diaThora:minutos:segundos
        LocalDateTime date07 = LocalDateTime.parse("2026-05-05T14:30:00");
        System.out.println(date07);

        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        LocalDateTime date08 = LocalDateTime.parse("20/05/26 14:30:12", formatter4);
        System.out.println("date08 - " + date08);
    }
}
