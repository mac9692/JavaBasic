package optionalclass.ex1;

public class Company {
    private String companyName;
    private ContactInfomation contactInfomation;

    public Company(String companyName, ContactInfomation contactInfomation) {
        this.companyName = companyName;
        this.contactInfomation = contactInfomation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ContactInfomation getContactInfomation() {
        return contactInfomation;
    }
}
