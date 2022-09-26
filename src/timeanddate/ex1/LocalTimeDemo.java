package timeanddate.ex1;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("지금 시각은 : " + now);

        LocalTime meetingTime = now.plusHours(2);
        meetingTime = meetingTime.plusMinutes(10);

        System.out.println("화상 미팅 시각은 : " + meetingTime);
    }
}
