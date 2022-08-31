package generic.interfaceex;

public class AppleImplBox<T extends Eatable> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        System.out.println(object.eat());
        return object;
    }
}
