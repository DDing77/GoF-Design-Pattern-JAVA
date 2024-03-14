package src.factory.character;

import src.factory.item.CharacterItemFactory;

public class Warrior extends Character {

    CharacterItemFactory characterItemFactory;

    public Warrior(CharacterItemFactory characterItemFactory) {
        this.characterItemFactory = characterItemFactory;
    }

    @Override
    public void provide() {
        System.out.println("전사 캐릭터 생성 중");
        weapon = characterItemFactory.createWeapon();
        shield = characterItemFactory.createShield();
        hat = characterItemFactory.createHat();
        clothes = characterItemFactory.createClothes();
        shoes = characterItemFactory.createShoes();
    }
}
