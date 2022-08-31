package enumex.afterenum;

public enum Person {
    MAN, WOMAN;

    private Person() {
        System.out.println("Person 생성자 호출");
    }

    @Override
    public String toString() {
        return "Enum Person Object";
    }
}
