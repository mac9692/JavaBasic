package enumex.beforeenum;

public class NonSafeConst {
    public static void main(String[] args) {
        who(Person.MAN);
        who(Animal.Dog);
    }

    public static void who(int man) {
        switch (man) {
            case Person.MAN:
                System.out.println("남자입니다.");
                break;

            case Person.WOMAN:
                System.out.println("여자입니다.");
                break;
        }
    }
}
