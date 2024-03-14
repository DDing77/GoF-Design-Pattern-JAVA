package src.factory.creation;

import src.factory.character.Character;
import src.factory.character.Warrior;
import src.factory.item.WarriorItemFactory;

public class WarriorCreationView extends CreationView {

    @Override
    protected Character createCharacter(String type) {
        if (type.equals("warrior")) {
            return new Warrior(new WarriorItemFactory());
        } else {
            return null;
        }
    }
}
