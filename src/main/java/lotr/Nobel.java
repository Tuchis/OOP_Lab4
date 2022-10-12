package lotr;

import java.util.Random;

abstract class Nobel extends Character{
    public Nobel(int power, int hp) {
        super(new Random().nextInt(11) + power, new Random().nextInt(11) + hp);
    }

    public void kick(Character kicked){
        int tempHp = kicked.getHp();
        kicked.setHp(kicked.getHp() - new Random().nextInt(this.getPower()));
        System.out.println(this.getClass().getSimpleName() + " kicks " + kicked.getClass().getSimpleName() + " and deals " + (kicked.getHp() - tempHp) + " damage.");
    }
}
