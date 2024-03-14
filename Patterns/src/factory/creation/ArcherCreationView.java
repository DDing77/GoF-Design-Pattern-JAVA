package src.factory.creation;

import src.factory.character.Character;
import src.factory.character.Warrior;
import src.factory.item.ArcherItemFactory;

public class ArcherCreationView extends CreationView {

    @Override
    protected Character createCharacter(String type) {
        if (type.equals("archer")) {
            return new Warrior(new ArcherItemFactory());
        } else {
            return null;
        }
    }
}
