package ExceptionHandling;

public class ExceptionMessage2 {
    public static void main(String[] args) {
        try {
            md1(3);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Appplication End");
    }

    public static void md1(int n) {
        md2(n,0);
    }

    public static void md2(int num1, int num2) {
        int r = num1 / num2;
    }
}
