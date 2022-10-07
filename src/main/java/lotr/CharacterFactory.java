//package lotr;
//
//import lombok.SneakyThrows;
//
//import java.util.Random;
//
//public class CharacterFactory {
//    @SneakyThrows
//    public Character createCharacter(){
//        Class[] characters = {Hobbit.class, King.class};
//        Reflections reflections = new Reflections("lotr");
//
//        return  (Character) characters[new Random(characters.length).nextInt()].getDeclaredConstructor().newInstance();
//    }
//}
