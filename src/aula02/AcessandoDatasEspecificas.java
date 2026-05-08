package aula02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class AcessandoDatasEspecificas {
    public static void main(String[] args) {
        LocalDateTime dataEHora = LocalDateTime.of(2028, 2, 29, 12, 30);
        System.out.println("Data e hora of() : " + dataEHora);

        System.out.println("Ano: " + dataEHora.getYear());
        System.out.println("Mes: " + dataEHora.getMonth());
        System.out.println("Mes: " + dataEHora.getMonthValue());
        System.out.println("Dia: " + dataEHora.getDayOfMonth());
        System.out.println("Dia: " + dataEHora.getDayOfWeek());
        System.out.println("Hora: " + dataEHora.getHour());
        System.out.println("Minuto: " + dataEHora.getMinute());

        //System.out.println("bissexto: " + dataEHora.isLeapYear()); // Desafio
        LocalDate localDate1 = LocalDate.of(2028, Month.FEBRUARY, 29);
        System.out.println(localDate1.isLeapYear());

    }
}
