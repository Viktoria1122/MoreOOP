package lotr.strategy;

import lotr.Character;

public class ElfKickStrategy implements KickStrategy {
    @Override
    public void kick(Character c) {
        if (c.getPower() < 10) {
            System.out.println("Elf kills " + c.getClass().getSimpleName());
            c.setHp(0);
        } else {
            System.out.println("Elf decreases power of " + c.getClass().getSimpleName());
            c.setHp(c.getHp() - 1);
        }
    }
}
