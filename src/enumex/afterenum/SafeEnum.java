package enumex.afterenum;

public class SafeEnum {
    public static void main(String[] args) {
        who(Person.MAN);
//        who(Animal.DOG);
//        Animal animal = Person.MAN;
    }

    public static void who(Person who) {
        switch (who) {
            case MAN:
                System.out.println("남자입니다.");
                break;
            case WOMAN:
                System.out.println("여자입니다.");
                break;
        }
    }
}
