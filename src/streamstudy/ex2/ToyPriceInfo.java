package streamstudy.ex2;

public class ToyPriceInfo {

    private final String model;
    private final int price;

    public ToyPriceInfo(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
