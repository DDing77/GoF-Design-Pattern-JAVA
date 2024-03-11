package src.decorator;

import src.decorator.addition.Meat;
import src.decorator.addition.Noodle;
import src.decorator.addition.Vegetable;
import src.decorator.component.Mala;
import src.decorator.component.Malatang;
import src.decorator.component.Xiangguo;

public class DecoratorTest {

    public static void main(String[] args) {

        Mala mala1 = new Malatang(2);
        System.out.println(mala1.getDescription() + " " + mala1.cost() + "원");

        Mala mala2 = new Malatang(2);
        mala2 = new Vegetable(mala2, 1);
        mala2 = new Meat(mala2, 2);
        mala2 = new Noodle(mala2, 1);
        System.out.println(mala2.getDescription() + " " + mala2.cost() + "원");

        Mala mala3 = new Xiangguo(3);
        mala3 = new Meat(mala3, 3);
        mala3 = new Vegetable(mala3, 3);
        mala3 = new Noodle(mala3, 1);
        System.out.println(mala3.getDescription() + " " + mala3.cost() + "원");
    }
}
