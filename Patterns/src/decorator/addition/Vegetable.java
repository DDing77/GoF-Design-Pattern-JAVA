package src.decorator.addition;

import src.decorator.Price;
import src.decorator.component.Mala;

public class Vegetable extends AdditionalIngredients {

    public Vegetable(Mala mala, int quantity) {
        this.mala = mala;
        this.quantity = quantity;
    }

    @Override
    public String getDescription() {
        return mala.getDescription() + " + 야채세트추가";
    }

    public double cost() {
        return mala.cost() + Price.Vegetable.getDefaultPrice() * getQuantity();
    }
}
