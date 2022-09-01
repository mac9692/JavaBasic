package methodreferences;

import java.util.function.ToIntBiFunction;

public class NoObjectMethodRef {
    public static void main(String[] args) {
        IBox iBox1 = new IBox(5);
        IBox iBox2 = new IBox(7);

        ToIntBiFunction<IBox, IBox> boxIBoxToIntBiFunction = IBox::larger;
        int bigNumber = boxIBoxToIntBiFunction.applyAsInt(iBox1, iBox2);
        System.out.println(bigNumber);
    }
}
