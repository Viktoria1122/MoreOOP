package lotr;

import lotr.strategy.KickStrategy;

public class Hobbit extends Character {
    public Hobbit(KickStrategy kickStrategy) {
        super(kickStrategy);
        this.power = 0;
        this.hp = 3;
    }

    @Override
    public void kick(Character c) {
        System.out.println("The Hobbit cries in fear!");
    }

    @Override
        public String getDescription() {
            return "Hobbit";
        }
}
