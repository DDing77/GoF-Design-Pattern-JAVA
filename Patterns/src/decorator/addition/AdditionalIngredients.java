package src.decorator.addition;

import src.decorator.component.Mala;

public abstract class AdditionalIngredients extends Mala{

    Mala mala;
    int quantity;

    public abstract String getDescription();

    public int getQuantity() {
        return quantity;
    }
}
