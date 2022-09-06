package optionalclass.ex3;

import java.util.Optional;

public class FlatMapElseOptional {
    public static void main(String[] args) {
        Optional<ContInfo> optionalContInfo = Optional.of(new ContInfo(Optional.ofNullable(null), Optional.of("korea")));

        String phone = optionalContInfo.flatMap(ContInfo::getPhone).orElse("전화번호가 없습니다.");
        String address = optionalContInfo.flatMap(ContInfo::getAddress).orElse("주소가 없습니다.");

        System.out.println(phone);
        System.out.println(address);
    }
}
