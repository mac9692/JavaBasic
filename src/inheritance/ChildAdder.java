package inheritance;

public class ChildAdder extends ParentAdder {
    @Override
    public int add(int a, int b) {
        System.out.println("ChildAdder.add");
        return a + b;
    }
}
