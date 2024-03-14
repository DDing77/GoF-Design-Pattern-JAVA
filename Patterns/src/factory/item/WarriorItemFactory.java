package src.factory.item;

import src.factory.item.clothes.Clothes;
import src.factory.item.clothes.WarriorClothes;
import src.factory.item.hat.Hat;
import src.factory.item.hat.WarriorHat;
import src.factory.item.shield.Shield;
import src.factory.item.shield.WarriorShield;
import src.factory.item.shoes.Shoes;
import src.factory.item.shoes.WarriorShoes;
import src.factory.item.weapon.WarriorWeapon;
import src.factory.item.weapon.Weapon;

public class WarriorItemFactory implements CharacterItemFactory {

    @Override
    public Weapon createWeapon() {
        return new WarriorWeapon();
    }

    @Override
    public Shield createShield() {
        return new WarriorShield();
    }

    @Override
    public Hat createHat() {
        return new WarriorHat();
    }

    @Override
    public Clothes createClothes() {
        return new WarriorClothes();
    }

    @Override
    public Shoes createShoes() {
        return new WarriorShoes();
    }
}
