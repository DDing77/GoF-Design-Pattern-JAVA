package src.decorator.component;

import src.decorator.Price;

public class Malatang extends Mala {

    public Malatang(int size) {
        this.description = "마라탕 사이즈 " + size;
        this.size = size;
    }

    @Override
    public double cost() {
        return Price.Malatang.getDefaultPrice() + Price.Malatang.getAdditionalPrice() * getSize();
    }
}
