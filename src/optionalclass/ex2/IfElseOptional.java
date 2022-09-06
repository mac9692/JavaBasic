package optionalclass.ex2;

import java.util.Optional;

public class IfElseOptional {
    public static void main(String[] args) {
//        ContInfo contInfo = new ContInfo(null, "Korea");
//
//        String phone;
//        String address;
//
//        if (contInfo.getPhone() != null) {
//            phone = contInfo.getPhone();
//        } else {
//            phone = "ContInfo 에 전화번호가 없음";
//        }
//
//        if (contInfo.getAddress() != null) {
//            address = contInfo.getAddress();
//        } else {
//            address = "ContInfo 에 주소가 없음";
//        }
//
//        System.out.println(phone);
//        System.out.println(address);

        Optional<ContInfo> contInfoOptional = Optional.of(new ContInfo(null, "korea"));

        String phone = contInfoOptional.map(ContInfo::getPhone).orElse("ContInfo 에 전화번호가 없음");
        String address = contInfoOptional.map(ContInfo::getAddress).orElse("ContInfo 에 주소가 없음");

        System.out.println(phone);
        System.out.println(address);
    }

}
