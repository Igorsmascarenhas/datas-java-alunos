package aula02;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class extra_calendar_x_time {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(" 1 === MUTABILIDADE (Date) ===");
//        Date d1 = new Date();
//        System.out.println("Data: " + d1);
//        d1.setTime(0);
//        System.out.println("Data: " + d1);
//
//
//        System.out.println(" 2 === MESES INDEXADOS (Calendar) ===");
//        Calendar cal = Calendar.getInstance();
//        cal.set(2025, 2, 10);
//
//        System.out.println("Data calendar: " + cal.getTime());
//
//        System.out.println(" 3 === NOME ENGANOSO ===");
//        Date d2 = new Date();
//        System.out.println("Data: " + d2);











       // System.out.println("==== 4. THREAD-SAFETY (Calendar) ====");

//        Calendar calendarioCompartilhado = Calendar.getInstance();
//
//        System.out.println("Compartilhado: " + calendarioCompartilhado.getTime());
//
//        Runnable task = () -> {
//            calendarioCompartilhado.add(Calendar.DAY_OF_YEAR, 1);
//            System.out.println(Thread.currentThread().getName() + " - " + calendarioCompartilhado.getTime());
//        };
//
//        Thread t1 = new Thread(task);
//        Thread t2 = new Thread(task);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();


        LocalDate dataCompartilhada = LocalDate.now();

        System.out.println("Compartilhado: " + dataCompartilhada);

        Runnable task = () -> {
            LocalDate novaData = dataCompartilhada.plusDays(1);
            System.out.println(Thread.currentThread().getName() + " - " + novaData);
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
