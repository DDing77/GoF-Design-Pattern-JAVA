package src.factory.character;

import src.factory.item.clothes.Clothes;
import src.factory.item.hat.Hat;
import src.factory.item.shield.Shield;
import src.factory.item.shoes.Shoes;
import src.factory.item.weapon.Weapon;

public abstract class Character {

    String name;

    Weapon weapon;
    Shield shield;
    Hat hat;
    Clothes clothes;
    Shoes shoes;

    public abstract void provide();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                '}';
    }
}
