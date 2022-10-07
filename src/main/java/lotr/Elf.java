package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    public void kick(Character whoKick){
        if (whoKick.getPower() < this.getPower()){
            whoKick.setHp(0);
        }
        else {
            this.setPower(this.getPower() - 1);
        }
    }
}
