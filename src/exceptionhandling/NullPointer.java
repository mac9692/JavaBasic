package exceptionhandling;

public class NullPointer {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);
        int length = str.length();
    }
}
