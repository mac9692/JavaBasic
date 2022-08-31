package generic.interfaceex;

public class Apple implements Eatable {
    @Override
    public String toString() {
        return "Apple Object";
    }

    @Override
    public String eat() {
        return "Apple Object Do Eat";
    }
}
