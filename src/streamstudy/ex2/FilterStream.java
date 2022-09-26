package streamstudy.ex2;

import java.util.Arrays;

public class FilterStream {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        Arrays.stream(intArr)
                .filter(num -> num % 2 == 1)
                .filter(num -> num == 1)
                .forEach(System.out::println);
    }
}
