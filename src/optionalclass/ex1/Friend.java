package optionalclass.ex1;

public class Friend {
    private String name;
    private Company company;

    public String getName() {
        return name;
    }

    public Company getCompany() {
        return company;
    }

    public Friend(String name, Company company) {
        this.name = name;
        this.company = company;
    }
}
