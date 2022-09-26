package timeanddate.ex1;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime meetingTime = localDateTime.plusHours(22).plusMinutes(35);
        System.out.println(meetingTime);
    }
}
