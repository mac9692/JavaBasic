package optionalclass.ex1;

import java.util.Optional;

public class NullPointerCaseStudy2 {
    public static void showCompanyAddress(Optional<Friend> optionalFriend) {
        String address = optionalFriend
                .map(Friend::getCompany)
                .map(Company::getContactInfomation)
                .map(ContactInfomation::getAddress)
                .orElse("정보에 주소가 없습니다.");

        System.out.println(address);
    }

    public static void main(String[] args) {
        ContactInfomation contactInfomation = new ContactInfomation("010", null);
        Company company = new Company("Co", contactInfomation);
        Friend friend = new Friend("Park", company);

        showCompanyAddress(Optional.of(friend));
    }
}
