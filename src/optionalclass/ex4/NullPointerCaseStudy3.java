package optionalclass.ex4;

import java.util.Optional;

public class NullPointerCaseStudy3 {

    public static void main(String[] args) {
        Optional<ContactInfo> optionalContactInfo = Optional.of(new ContactInfo(Optional.ofNullable(null), Optional.of("korea")));

        Optional<Company> optionalCompany = Optional.of(new Company("Company Name", optionalContactInfo));

        Optional<Friend> optionalFriend = Optional.of(new Friend("Park", optionalCompany));


        showCompanyAddress(optionalFriend);
    }

    private static void showCompanyAddress(Optional<Friend> optionalFriend) {
        String address = optionalFriend.flatMap(Friend::getCompany)
                .flatMap(Company::getContactInfo)
                .flatMap(ContactInfo::getAddress)
                .orElse("주소가 없습니다.");

        System.out.println(address);
    }
}
