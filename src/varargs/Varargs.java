package varargs;

public class Varargs {
    public static void showAll(String... varargs) {
        System.out.println("문자의 길이 : " + varargs.length);

        for (String str : varargs) {
            System.out.print(str + '\t');
        }

        System.out.println();
    }

    public static void main(String[] args) {
        showAll("Box");
        showAll("Box", "Toy");
        showAll("Box", "Toy", "Apple");
    }
}
