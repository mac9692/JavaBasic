package streamstudy.ex1;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        String[] arr = {"YOON", "LEE", "PARK"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(System.out::println);
    }
}
