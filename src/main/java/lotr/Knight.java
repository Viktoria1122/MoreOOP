package lotr;

import java.util.Random;
import lotr.strategy.KingKickStrategy;

public class Knight extends Character {

    public Knight() {
        super(new KingKickStrategy());
        this.power = new Random().nextInt(11) + 2;
        this.hp = new Random().nextInt(11) + 2;
    }

    @Override
    public String getDescription() {
        return "A brave knight, ready for battle.";
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
    }
}
