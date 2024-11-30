package lotr.strategy;

import lotr.Character;

import java.util.Random;

public class KingKickStrategy implements KickStrategy {
    @Override
    public void kick(Character c) {
        Random random = new Random();
        int damage = random.nextInt(10) + 1;
        System.out.println("King hits " + c.getClass().getSimpleName() + " for " + damage + " damage.");
        c.setHp(c.getHp() - damage);
    }
}
