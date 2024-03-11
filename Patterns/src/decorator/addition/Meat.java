package src.decorator.addition;

import src.decorator.Price;
import src.decorator.component.Mala;

public class Meat extends AdditionalIngredients {

    public Meat(Mala mala , int quantity) {
        this.mala = mala;
        this.quantity = quantity;
    }

    @Override
    public String getDescription() {
        return mala.getDescription() + " + 고기추가";
    }

    public double cost() {
        return mala.cost() + Price.Meat.getDefaultPrice() * getQuantity();
    }
}
