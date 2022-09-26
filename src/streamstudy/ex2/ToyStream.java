package streamstudy.ex2;

import java.util.ArrayList;
import java.util.List;

public class ToyStream {
    public static void main(String[] args) {
        List<ToyPriceInfo> toyPriceInfoList = new ArrayList<>();

        toyPriceInfoList.add(new ToyPriceInfo("Park", 1));
        toyPriceInfoList.add(new ToyPriceInfo("Park", 20));
        toyPriceInfoList.add(new ToyPriceInfo("Park", 300));

        int sum = toyPriceInfoList.stream()
                .filter(p -> p.getPrice() < 300)
                .mapToInt(ToyPriceInfo::getPrice)
                .sum();

        System.out.println(sum);
    }
}
