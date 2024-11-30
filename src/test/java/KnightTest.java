import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lotr.Knight;
import lotr.Character;
import static org.junit.jupiter.api.Assertions.*;

public class KnightTest {
    private Character knight;

    @BeforeEach
    public void init() {
        knight = new Knight();
    }

    @Test
    public void testIsCharacter() {
        assertTrue(knight instanceof Character, "Knight should be an instance of Character.");
    }

    @Test
    public void testHpAndPowerRange() {
        assertTrue(knight.getHp() >= 2 && knight.getHp() <= 12, 
                "Knight's HP should be between 2 and 12.");
        assertTrue(knight.getPower() >= 2 && knight.getPower() <= 12, 
                "Knight's Power should be between 2 and 12.");
    }

    @Test
    public void testKickDecreasesEnemyHp() {
        Character enemy = new Knight();
        int initialHp = enemy.getHp();
        knight.kick(enemy);

        assertTrue(initialHp > enemy.getHp(), "Knight's kick should decrease the enemy's HP.");
    }

    @Test
    public void testKickStrategy() {
        Character enemy = new Knight();
        int initialHp = enemy.getHp();

        knight.kick(enemy);

        assertTrue(initialHp > enemy.getHp(), "Knight's kick strategy should reduce enemy HP.");
    }
}
