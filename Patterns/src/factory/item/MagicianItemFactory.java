package src.factory.item;

import src.factory.item.clothes.Clothes;
import src.factory.item.clothes.MagicianClothes;
import src.factory.item.hat.Hat;
import src.factory.item.hat.MagicianHat;
import src.factory.item.shield.MagicianShield;
import src.factory.item.shield.Shield;
import src.factory.item.shield.WarriorShield;
import src.factory.item.shoes.MagicianShoes;
import src.factory.item.shoes.Shoes;
import src.factory.item.weapon.MagicianWeapon;
import src.factory.item.weapon.WarriorWeapon;
import src.factory.item.weapon.Weapon;

public class MagicianItemFactory implements CharacterItemFactory {

    @Override
    public Weapon createWeapon() {
        return new MagicianWeapon();
    }

    @Override
    public Shield createShield() {
        return new MagicianShield();
    }

    @Override
    public Hat createHat() {
        return new MagicianHat();
    }

    @Override
    public Clothes createClothes() {
        return new MagicianClothes();
    }

    @Override
    public Shoes createShoes() {
        return new MagicianShoes();
    }
}
