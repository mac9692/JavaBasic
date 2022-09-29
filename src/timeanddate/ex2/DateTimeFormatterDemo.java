package timeanddate.ex2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        ZonedDateTime date = ZonedDateTime.of(LocalDateTime.of(2022, 9, 28, 20, 20), ZoneId.of("Asia/Seoul"));

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yy-M-d");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-d, H:m:s");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-d, HH:mm:ss VV");

        System.out.println(date.format(formatter1));
        System.out.println(date.format(formatter2));
        System.out.println(date.format(formatter3));
    }
}
