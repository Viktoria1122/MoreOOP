package lotr;

import lotr.strategy.ElfKickStrategy;

public class Elf extends Character {

    public Elf() {
        super(new ElfKickStrategy());
        this.power = 10;
        this.hp = 10;
    }

    @Override
        public String getDescription() {
            return "Elf";
        }
}
