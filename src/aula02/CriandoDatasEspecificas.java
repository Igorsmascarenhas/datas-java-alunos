package aula02;

import java.time.LocalDate;
import java.time.Month;

public class CriandoDatasEspecificas {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Data e hora now(): " + localDate);

        LocalDate localDate2 = LocalDate.of(2025, 4, 15);
        System.out.println("Data e hora of() : " + localDate2);

        LocalDate localDate3 = LocalDate.of(2023, Month.FEBRUARY, 10);
        System.out.println("Data e hora of() : " + localDate3);

        LocalDate localDate4 = LocalDate.of(2028, Month.FEBRUARY, 29);
        System.out.println("Data e hora of() : " + localDate4);
    }
}
