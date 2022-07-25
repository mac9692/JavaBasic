package ExceptionHandling;

public class ExceptionMessage {
    public static void main(String[] args) {
        md1(3);
        System.out.println("Appplication End");
    }

    public static void md1(int n) {
        md2(n,0);
    }

    public static void md2(int num1, int num2) {
        int r = num1 / num2;
    }
}
