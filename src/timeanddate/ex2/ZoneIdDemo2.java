package timeanddate.ex2;

import java.time.ZoneId;

public class ZoneIdDemo2 {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds()
                .stream()
                .filter(str -> str.startsWith("Asia"))
                .sorted()
                .forEach(System.out::println);
    }
}
