package aula02;

import java.time.LocalDate;

public class ComparandoDatas {
    public static void main(String[] args) {
        LocalDate inicioCurso = LocalDate.of(2023, 5, 15);
        LocalDate fimCurso = LocalDate.of(2027, 5, 15);
        LocalDate hoje = LocalDate.now();

        System.out.println("O curso ja iniciou: " + hoje.isAfter(inicioCurso));
        System.out.println("O curso ja encerrou: " + hoje.isAfter(fimCurso));
        System.out.println("O curso esta em andamento: " + hoje.isBefore(fimCurso));
        System.out.println("Sao iguais : " + hoje.isEqual(fimCurso));


        // use o == apenas para tipos primitivos (int, float...)
        // Nao usar para objetos e Wrapper Classes (Interger, Float)

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.now();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println("d1 == d2: " + (d1 == d2));
        System.out.println("d1 isEqual d2: " + (d1.isEqual(d2)));
    }
}
