package optionalclass.ex4;

import java.util.Optional;

public class ContactInfo {
    private Optional<String> phoneNumber;
    private Optional<String> address;

    public ContactInfo(Optional<String> phoneNumber, Optional<String> address) {
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }

    public Optional<String> getAddress() {
        return address;
    }
}
