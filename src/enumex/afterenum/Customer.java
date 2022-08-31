package enumex.afterenum;

public class Customer {

    enum Gender {
        MALE, FEMALE
    }

    private String name;
    private Gender gender;

    public Customer(String name, String gender) {
        this.name = name;

        if ("man".equals(gender)) {
            this.gender = Gender.MALE;
        } else {
            this.gender = Gender.FEMALE;
        }
    }

    @Override
    public String toString() {
        if (gender == Gender.MALE) {
            return "Mr " + name;
        } else {
            return "Ms " + name;
        }
    }
}
