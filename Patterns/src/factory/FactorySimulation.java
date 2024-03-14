package src.factory;

import src.factory.character.Character;
import src.factory.creation.ArcherCreationView;
import src.factory.creation.CreationView;
import src.factory.creation.MagicianCreationView;
import src.factory.creation.WarriorCreationView;

public class FactorySimulation {

    public static void main(String[] args) {

        CreationView warriorView = new WarriorCreationView();
        Character warrior = warriorView.selectCharacter("warrior");

        CreationView archerView = new ArcherCreationView();
        Character archer = archerView.selectCharacter("archer");

        CreationView magicianView = new MagicianCreationView();
        Character magician = magicianView.selectCharacter("magician");
    }

}
