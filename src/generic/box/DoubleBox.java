package generic.box;

public class DoubleBox<L,R> {
    private L left;
    private R right;

    @Override
    public String toString() {
        return left + " & " + right;
    }

    public L getLeft() {
        return left;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public R getRight() {
        return right;
    }

    public void setRight(R right) {
        this.right = right;
    }

    public void setLeftAndRight(L left, R right) {
        this.left = left;
        this.right = right;
    }
}
