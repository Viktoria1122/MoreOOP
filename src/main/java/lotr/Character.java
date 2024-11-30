package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lotr.strategy.ElfKickStrategy;
import lotr.strategy.KickStrategy;
import lotr.strategy.KingKickStrategy;

@AllArgsConstructor
@Getter
@Setter
public abstract class Character {
    protected int power;
    protected int hp;
    protected KickStrategy kickStrategy;

    public Character(KickStrategy kickStrategy) {
        this.kickStrategy = kickStrategy;
    }

    public void kick(Character c) {
        kickStrategy.kick(c);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public Character(ElfKickStrategy elfKickStrategy) {
        //TODO Auto-generated constructor stub
    }

    public Character(KingKickStrategy kingKickStrategy) {
        //TODO Auto-generated constructor stub
    }

    public abstract String getDescription();
}

