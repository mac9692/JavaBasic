package varargs;

public class VarargsBefore {
    public static void showAll(String[] vargs) {
        System.out.println("문자의 길이 : " + vargs.length);

        for (String str : vargs) {
            System.out.print(str + '\t');
        }

        System.out.println();
    }

    public static void main(String[] args) {
        showAll(new String[]{"Box"});
        showAll(new String[]{"Box", "Toy"});
        showAll(new String[]{"Box", "Toy", "Apple"});
    }
}
