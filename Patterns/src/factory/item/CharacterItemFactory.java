package src.factory.item;

import src.factory.item.clothes.Clothes;
import src.factory.item.hat.Hat;
import src.factory.item.shield.Shield;
import src.factory.item.shoes.Shoes;
import src.factory.item.weapon.Weapon;

public interface CharacterItemFactory {

    public Weapon createWeapon();

    public Shield createShield();

    public Hat createHat();

    public Clothes createClothes();

    public Shoes createShoes();
}
