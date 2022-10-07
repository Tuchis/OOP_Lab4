package lotr;

import java.util.Random;

abstract class Nobel extends Character{
    public Nobel(int power, int hp) {
        super(new Random().nextInt(11) + power, new Random().nextInt(11) + hp);
    }

    public void kick(Character kicked){
        kicked.setHp(kicked.getHp() - new Random().nextInt(this.getPower()));
    }
}
