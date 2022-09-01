package optionalclass.ex1;

public class ContactInfomation {
    private String phoneNumber;
    private String address;

    public ContactInfomation(String phoneNumber, String address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
