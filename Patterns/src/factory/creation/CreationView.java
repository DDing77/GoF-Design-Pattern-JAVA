package src.factory.creation;

import src.factory.character.Character;

public abstract class CreationView {

    public Character selectCharacter(String type) {
        Character character = createCharacter(type);

        character.provide();

        return character;
    }

    protected abstract Character createCharacter(String type);
}
