package optionalclass.ex4;

import java.util.OptionalInt;

public class OptionalIntBase {
    public static void main(String[] args) {
        OptionalInt optionalInt1 = OptionalInt.of(3);
        OptionalInt optionalInt2 = OptionalInt.empty();

        System.out.println("start : ");
        optionalInt1.ifPresent(System.out::println);
        optionalInt2.ifPresent(System.out::println);
        System.out.println("start2 : ");
        System.out.println(optionalInt1.orElse(100));
        System.out.println(optionalInt2.orElse(200));
    }
}
