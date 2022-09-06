package optionalclass.ex3;

import java.util.Optional;

public class ContInfo {
    Optional<String> phone;
    Optional<String> address;

    public ContInfo(Optional<String> phone, Optional<String> address) {
        this.phone = phone;
        this.address = address;
    }

    public Optional<String> getPhone() {
        return phone;
    }

    public Optional<String> getAddress() {
        return address;
    }
}
