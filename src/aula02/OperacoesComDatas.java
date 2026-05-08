package aula02;

import java.time.LocalDate;
import java.time.LocalTime;

public class OperacoesComDatas {
    public static void main(String[] args) {

        LocalDate data = LocalDate.of(2020, 1, 15);

        // Adicionando
        System.out.println("data d: " + data.plusDays(10));
        System.out.println("data w: " + data.plusWeeks(2));
        System.out.println("data m: " + data.plusMonths(5));
        System.out.println("data y: " + data.plusYears(2));

        LocalTime hora = LocalTime.of(11, 0);
        System.out.println("hora m: " + hora.plusMinutes(10));

        // Subtracao
        System.out.println("hora m: " + hora.minusHours(2));

        // Substituicao de componentes
        LocalDate data2 = LocalDate.of(2020, 1, 15);
        System.out.println("data d2: " + data2.withYear(2030));

        LocalDate data3 = LocalDate.of(2028, 2, 29);
        System.out.println("data d3: " + data3);
        System.out.println("data d3: " + data3.plusYears(1));
    }
}
