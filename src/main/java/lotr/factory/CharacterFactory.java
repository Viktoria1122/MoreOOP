package lotr.factory;

import lotr.Character;
import lotr.*;

import java.util.Random;

public class CharacterFactory {
    private static final Character[] characters = {
        new Hobbit(null),
        new Elf(),
        new King(),
        new Knight()
    };

    public Character createCharacter() {
        Random random = new Random();
        return characters[random.nextInt(characters.length)];
    }
}

