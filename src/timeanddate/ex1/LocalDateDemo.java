package timeanddate.ex1;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalDate xMas = LocalDate.of(today.getYear(), 12, 25);
        System.out.println("X-Mas : " + xMas);

        LocalDate eve = xMas.minusDays(1);
        System.out.println("X-Mas Eve : " + eve);
    }
}
