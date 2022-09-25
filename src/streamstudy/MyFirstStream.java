package streamstudy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyFirstStream {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        IntStream stream1 = Arrays.stream(arr);
        IntStream stream2 = stream1.filter(arrNumber -> arrNumber % 2 == 1);
        int sum = stream2.sum();
        System.out.println(sum);
    }
}
