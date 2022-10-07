package lotr;

import java.util.Random;

public class King extends Nobel {
    public King(){
        super(5, 5);
    }

    @Override
    public void kick(Character whoKick){
        whoKick.setHp(whoKick.getHp() - new Random().nextInt(this.getPower()));
    }
}
