package src.decorator.component;

import src.decorator.Price;

public class Xiangguo extends Mala {

    public Xiangguo(int size) {
        this.description = "마라샹궈 사이즈 " + size;
        this.size = size;
    }

    @Override
    public double cost() {
        return Price.Xiangguo.getDefaultPrice() + Price.Xiangguo.getAdditionalPrice() * getSize();
    }
}
