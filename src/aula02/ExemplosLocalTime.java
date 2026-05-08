package aula02;

import java.time.LocalTime;

public class ExemplosLocalTime {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(12, 0, 12);
        System.out.println(localTime);

        LocalTime localTime2 = LocalTime.of(11, 00);
        System.out.println(localTime2);



        // Como lidar com relogio de 12hrs
        // localTime2.plusHours(3);
    }
}
