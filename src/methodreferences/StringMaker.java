package methodreferences;

import java.util.function.Function;

public class StringMaker {
    public static void main(String[] args) {
        Function<char[], String> function = String::new;

        char[] src = {'R', 'O', 'B', 'O', 'T'};
        String str = function.apply(src);

        System.out.println(str);
    }
}
