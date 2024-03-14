package src.factory.creation;

import src.factory.character.Character;
import src.factory.character.Magician;
import src.factory.item.MagicianItemFactory;

public class MagicianCreationView extends CreationView {

    @Override
    protected Character createCharacter(String type) {
        if (type.equals("magician")) {
            return new Magician(new MagicianItemFactory());
        } else {
            return null;
        }
    }
}
