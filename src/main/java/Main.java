import lotr.Character;
import lotr.CharacterFactory;
import lotr.GameManager;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        Character character = factory.createCharacter();
        System.out.println(character);
        GameManager manager = new GameManager();
        manager.fight(factory.createCharacter(), factory.createCharacter());
    }
}
