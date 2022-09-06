package optionalclass.ex4;

import java.util.Optional;

public class Company {
    private String companyName;
    private Optional<ContactInfo> contactInfo;

    public Company(String companyName, Optional<ContactInfo> contactInfo) {
        this.companyName = companyName;
        this.contactInfo = contactInfo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Optional<ContactInfo> getContactInfo() {
        return contactInfo;
    }
}
