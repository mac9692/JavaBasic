package inheritance;

public class OverridingToString {
    public static void main(String[] args) {
        Cake cake1 = new Cake();
        Cake cake2 = new CheeseCake();

        System.out.println(cake1);
        System.out.println();
        System.out.println(cake2);
    }
}
