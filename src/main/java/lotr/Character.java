package lotr;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter@AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    public abstract void kick(Character whoKick);

    public boolean isAlive(){
        return this.getHp() > 0;
    }
}
