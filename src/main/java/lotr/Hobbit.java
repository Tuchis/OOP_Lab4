package lotr;

import lombok.ToString;

public class Hobbit extends Character{
    private int hp;
    private int power;

    public Hobbit(){
        super(0,3);
    }
    public void kick(Character whoKick){
        System.out.println("Cries with dignity.");
    }
}
