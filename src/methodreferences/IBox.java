package methodreferences;

public class IBox {
    private int number;

    public IBox(int number) {
        this.number = number;
    }

    public int larger(IBox iBox) {
        if (number > iBox.number) {
            return this.number;
        } else {
            return iBox.number;
        }
    }
}
