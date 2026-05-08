package aula02;

import java.time.LocalDate;
import java.time.Month;

public class ImutabilidadeDeDatas {
    public static void main(String[] args) {
        LocalDate original = LocalDate.of(2026, 3, 20);
        System.out.println("original 1: " + original);

        LocalDate copia = original.plusDays(3);

        System.out.println("original 2: " + original);

    }
}
