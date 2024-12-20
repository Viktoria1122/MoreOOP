import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lotr.Hobbit;
import lotr.Elf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElfTest {
    private Elf character;

    @BeforeEach
    public void init() {
        character = new Elf();
    }

    @Test
    public void testToString(){ assertEquals("Elf{hp=10, power=10}", character.toString());
    }

    @Test
    public void testKick() {
        Hobbit hobbit = new Hobbit(null);
        character.kick(hobbit);
        assertEquals(0, hobbit.getHp());
    }
}

