package optionalclass.ex2;

import java.util.Optional;

public class OptionalOrElse {
    public static void main(String[] args) {
        Optional<String> stringOptional1 = Optional.empty();
        Optional<String> stringOptional2 = Optional.of("Java Basic");
        Optional<String> stringOptional3 = Optional.ofNullable(null);

        String str1 = stringOptional1.map(String::toString).orElse("Empty");
        String str2 = stringOptional2.map(String::toString).orElse("Empty");

        System.out.println(str1);
        System.out.println(str2);


        //empty() 와 ofNullable(null) 비교
        System.out.println(stringOptional1);
        System.out.println(stringOptional3);
        System.out.println(stringOptional1.equals(stringOptional3));
    }
}
