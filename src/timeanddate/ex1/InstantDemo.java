package timeanddate.ex1;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
    public static void main(String[] args) {
        Instant startTime = Instant.now();
        System.out.println("시작 시간 : " + startTime.getEpochSecond());

        Instant endTime = Instant.now();
        System.out.println("종료 시간: " + endTime.getEpochSecond());

        Duration between = Duration.between(startTime, endTime);
        System.out.println("시간 차(ms) : " + between.toMillis());

    }
}
