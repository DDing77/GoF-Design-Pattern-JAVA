package src.decorator;

public enum Price {

    Malatang(8_000 , 4_000),
    Xiangguo(12_000, 6_000),
    Vegetable(2_000, 0),
    Meat(3_000, 0),
    Noodle(3_000, 0);

    private final double defaultPrice;
    private final double additionalPrice;

    Price(double defaultPrice, double additionalPrice) {
        this.defaultPrice = defaultPrice;
        this.additionalPrice = additionalPrice;
    }

    public double getDefaultPrice() {
        return defaultPrice;
    }

    public double getAdditionalPrice() {
        return additionalPrice;
    }
}
