package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    public void kick(Character whoKick){
        if (whoKick.getPower() < this.getPower()){
            whoKick.setHp(0);
            System.out.println("Elf kills " + whoKick.getClass().getSimpleName());
        }
        else {
            this.setPower(this.getPower() - 1);
            System.out.println("Elf becomes weaker");
        }
    }
}
