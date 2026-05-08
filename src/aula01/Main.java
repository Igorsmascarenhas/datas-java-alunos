package aula01;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        // Data local e hora (opcional)
        LocalDate date01 = LocalDate.now(); // now -> agora
        System.out.println("date 01 - " + date01);

        LocalTime time01 = LocalTime.now();
        System.out.println("time 01 - " + time01);

        System.out.println("Datetime 01 - " + date01 + "T" + time01);

        LocalDateTime date02 = LocalDateTime.now();
        System.out.println("Datetime 02 - " + date02);

        // Data e hora global
        Instant instant1 = Instant.now();
        System.out.println("instant  01 - " + instant1);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime 01 - " + zonedDateTime);

        // 2026-05-05T21:05:06.885094900-03:00[America/Sao_Paulo]

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Australia/Melbourne"));
        System.out.println("zonedDateTime2 - " + zonedDateTime2);


//        for (String s: ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }

        // Duracao

    }
}