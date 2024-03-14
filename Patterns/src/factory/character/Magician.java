package src.factory.character;

import src.factory.item.CharacterItemFactory;

public class Magician extends Character {

    CharacterItemFactory characterItemFactory;

    public Magician(CharacterItemFactory characterItemFactory) {
        this.characterItemFactory = characterItemFactory;
    }

    @Override
    public void provide() {
        System.out.println("마법사 캐릭터 생성 중");
        weapon = characterItemFactory.createWeapon();
        shield = characterItemFactory.createShield();
        hat = characterItemFactory.createHat();
        clothes = characterItemFactory.createClothes();
        shoes = characterItemFactory.createShoes();
    }
}
