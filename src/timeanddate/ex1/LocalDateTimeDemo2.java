package timeanddate.ex1;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo2 {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.of(2022, 4, 25, 11, 20);
        LocalDateTime flight1 = LocalDateTime.of(2022, 5, 14, 11, 15);
        LocalDateTime flight2 = LocalDateTime.of(2022, 5, 13, 15, 30);

        LocalDateTime myFlight;

        if (flight1.isBefore(flight2)) {
            myFlight = flight1;
        } else {
            myFlight = flight2;
        }

        Period period = Period.between(today.toLocalDate(), myFlight.toLocalDate());
        Duration duration = Duration.between(today.toLocalTime(), myFlight.toLocalTime());

        System.out.println(period);
        System.out.println(duration);
    }
}
