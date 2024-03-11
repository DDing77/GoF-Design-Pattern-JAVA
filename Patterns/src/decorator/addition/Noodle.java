package src.decorator.addition;

import src.decorator.Price;
import src.decorator.component.Mala;

public class Noodle extends AdditionalIngredients{


    public Noodle(Mala mala, int quantity) {
        this.mala = mala;
        this.quantity = quantity;
    }

    @Override
    public String getDescription() {
        return mala.getDescription() + " + 면사리추가";
    }

    public double cost() {
        return mala.cost() + Price.Noodle.getDefaultPrice() * getQuantity();
    }
}
