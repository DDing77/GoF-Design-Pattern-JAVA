package src.factory.item;

import src.factory.item.clothes.ArcherClothes;
import src.factory.item.clothes.Clothes;
import src.factory.item.hat.ArcherHat;
import src.factory.item.hat.Hat;
import src.factory.item.shield.ArcherShield;
import src.factory.item.shield.Shield;
import src.factory.item.shoes.ArcherShoes;
import src.factory.item.shoes.Shoes;
import src.factory.item.weapon.ArcherWeapon;
import src.factory.item.weapon.Weapon;

public class ArcherItemFactory implements CharacterItemFactory {

    @Override
    public Weapon createWeapon() {
        return new ArcherWeapon();
    }

    @Override
    public Shield createShield() {
        return new ArcherShield();
    }

    @Override
    public Hat createHat() {
        return new ArcherHat();
    }

    @Override
    public Clothes createClothes() {
        return new ArcherClothes();
    }

    @Override
    public Shoes createShoes() {
        return new ArcherShoes();
    }
}
