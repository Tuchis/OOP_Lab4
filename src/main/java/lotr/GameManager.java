package lotr;

public class GameManager {
    public void fight(Character fighter1, Character fighter2){
        System.out.println("Fighter 1 is " + fighter1.toString());
        System.out.println("Fighter 2 is " + fighter2.toString());
        while (fighter1.isAlive() && fighter2.isAlive()){
            int fighter2Hp = fighter2.getHp();
            fighter1.kick(fighter2);
            if (!fighter2.isAlive()){
                System.out.println("Fighter one has won. Congrats!");
                break;
            }
            int fighter1Hp = fighter1.getHp();
            System.out.println(fighter1.getClass().getSimpleName() + " kicks " + fighter2.getClass().getSimpleName() + " and deals " + (fighter2.getHp() - fighter2Hp) + ". " + fighter2.getClass().getSimpleName() + " has only " + fighter2.getHp() + " HP");
            fighter2.kick(fighter1);
            if (!fighter1.isAlive()){
                System.out.println("Fighter two has won. Congrats!");
                break;
            }
            System.out.println(fighter2.getClass().getSimpleName() + " kicks " + fighter1.getClass().getSimpleName() + " and deals " + (fighter1.getHp() - fighter1Hp) + ". " + fighter1.getClass().getSimpleName() + " has only " + fighter1.getHp() + " HP");        }
    }
}
