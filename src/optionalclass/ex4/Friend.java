package optionalclass.ex4;

import java.util.Optional;

public class Friend {
    private String name;
    private Optional<Company> company;

    public Friend(String name, Optional<Company> company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public Optional<Company> getCompany() {
        return company;
    }
}
