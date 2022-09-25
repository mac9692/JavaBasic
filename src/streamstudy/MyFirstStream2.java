package streamstudy;

import java.util.Arrays;

public class MyFirstStream2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(arr)
                .filter(arrNumber -> arrNumber % 2 == 1)
                .sum();

        System.out.println(sum);
    }
}
