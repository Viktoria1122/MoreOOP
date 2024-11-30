package lotr;

import lotr.strategy.KingKickStrategy;

public class King extends Character {
        public King() {
            super(new KingKickStrategy());
            this.power = (int) (Math.random() * 11 + 5);
            this.hp = (int) (Math.random() * 11 + 5);
        }

        @Override
        public String getDescription() {
            return "King";}
}
