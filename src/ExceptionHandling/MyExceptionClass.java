package ExceptionHandling;

import java.util.Scanner;

public class MyExceptionClass {
    public static void main(String[] args) {
        System.out.println("나이 입력 : ");

        try {
            int age = readAge();
            System.out.printf("입력된 나이 : %d", age);
        } catch (ReadAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int readAge() throws ReadAgeException {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 0) {
            throw (new ReadAgeException());
        }
        return age;
    }
}

class FirstException extends Exception {
}

class SecondException extends FirstException {
}

class ThirdException extends SecondException {
}