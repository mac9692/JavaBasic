package streamstudy.ex1;

import java.util.Arrays;

public class StringStream2 {
    public static void main(String[] args) {
        String[] strs = {"Park", "Han", "Hong"};

        Arrays.stream(strs).forEach(System.out::println);
    }
}
