package objectClass;

public class StringEquality {
    public static void main(String[] args) {
        String str1 = new String("Park");
        String str2 = new String("Park");

        if (str1 == str2) {
            System.out.println("str1 = str2");
        } else {
            System.out.println("str1 != str2");
        }

        if (str1.equals(str2)) {
            System.out.println("str1 = str2");
        } else {
            System.out.println("str1 != str2");
        }
    }
}
