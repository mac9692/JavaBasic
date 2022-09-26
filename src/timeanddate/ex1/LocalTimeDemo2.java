package timeanddate.ex1;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.now();
        System.out.println("시작 시간은 : " + startTime);

        LocalTime endTime = LocalTime.now();
        System.out.println("종료 시간은 : " + endTime);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println("두 시간 차이는 : " + duration);
    }
}
