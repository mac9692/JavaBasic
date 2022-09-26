package timeanddate.ex1;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateDemo2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);

        LocalDate xMas = LocalDate.of(today.getYear(), 12, 25);
        System.out.println("X-MAS : " + xMas);

        Period leftTime = Period.between(today, xMas);
        System.out.println("X-Mas 까지 앞으로 : " + leftTime.getMonths() + "월" + +leftTime.getDays() + "일");
    }
}
