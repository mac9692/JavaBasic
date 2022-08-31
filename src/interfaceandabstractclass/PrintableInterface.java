package interfaceandabstractclass;

interface Printable {
    public abstract void print(String doc); //추상 메소드
}

class Printer implements Printable {

    @Override
    public void print(String doc) {
        System.out.println(doc);
    }
}

public class PrintableInterface {
    public static void main(String[] args) {
        Printable printable = new Printer();
        printable.print("abc");
    }
}


