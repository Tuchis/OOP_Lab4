package lotr;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    @Setter@Getter
    private int power;

    public Character(int power, int hp){
        this.setPower(power);
        this.setHp(hp);
    }

    public void setHp(int hp){
        if (hp >= 0){
            this.hp = hp;
        }
        else {
            this.hp = 0;
        }
    }

    public abstract void kick(Character whoKick);

    public boolean isAlive(){
        return this.getHp() > 0;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
