import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lotr.King;
import lotr.Character;
import lotr.strategy.KingKickStrategy;

import static org.junit.jupiter.api.Assertions.*;

public class KingTest {
    private King king;

    @BeforeEach
    public void init() {
        king = new King();
    }

    @Test
    public void testIsCharacter() {
        assertTrue(king instanceof Character);
    }

    @Test
    public void testHp() {
        assertTrue(king.getHp() >= 5 && king.getHp() <= 15, 
                "King's HP should be between 5 and 15.");
    }

    @Test
    public void testPower() {
        assertTrue(king.getPower() >= 5 && king.getPower() <= 15, 
                "King's Power should be between 5 and 15.");
    }

    @Test
    public void testKick() {
        Character enemy = new King();
        int initialHp = enemy.getHp();
        king.kick(enemy);

        assertTrue(initialHp > enemy.getHp(), "King's kick should decrease the enemy's HP.");
    }

    @Test
    public void testKickStrategy() {
        KingKickStrategy kickStrategy = new KingKickStrategy();
        Character enemy = new King();
        int initialHp = enemy.getHp();

        kickStrategy.kick(enemy);
        assertTrue(initialHp > enemy.getHp(), "King's kick strategy should reduce enemy HP.");
    }
}
