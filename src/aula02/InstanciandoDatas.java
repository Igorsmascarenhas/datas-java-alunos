package aula02;

import java.time.*;

public class InstanciandoDatas {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Hoje: " + localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println("Horario: " + localTime);

        System.out.println("Data e hora " + localDate + " " + localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Data e hora " + localDateTime);

        Instant instant = Instant.now();
        System.out.println("Data e hora " + instant);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Data e hora " + zonedDateTime);
    }
}
