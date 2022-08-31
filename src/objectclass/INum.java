package objectclass;

public class INum {
    private int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((INum) (obj)).num;
    }
}
