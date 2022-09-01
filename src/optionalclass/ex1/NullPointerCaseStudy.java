package optionalclass.ex1;

public class NullPointerCaseStudy {
    public static void showCompanyAddress(Friend friend) {
        String address = null;

        if (friend != null) {
            Company company = friend.getCompany();

            if (company != null) {
                ContactInfomation contactInfomation = company.getContactInfomation();

                if (contactInfomation != null) {
                    address = contactInfomation.getAddress();
                }
            }

            if (address != null) {
                System.out.println(address);
            } else {
                System.out.println("Address is null");
            }
        }
    }

    public static void main(String[] args) {
        ContactInfomation contactInfomation = new ContactInfomation("010", "Korea");
        Company company = new Company("Co", contactInfomation);
        Friend friend = new Friend("Park", company);

        showCompanyAddress(friend);
    }
}
