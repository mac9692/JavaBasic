package exam;

public class Park extends Person {

    @Override
    public void breath() {
        System.out.println("숨쉬기 박박");
    }

    public String add(String num1, String num2) {
        return num1 + num2;
    }
}
