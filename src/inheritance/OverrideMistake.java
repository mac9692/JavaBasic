package inheritance;

public class OverrideMistake {
    public static void main(String[] args) {
        ParentAdder parentAdder = new ChildAdder();
        System.out.println(parentAdder.add(3, 4));
    }
}
