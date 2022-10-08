package lotr;

import lombok.SneakyThrows;
import org.apache.log4j.BasicConfigurator;
import org.reflections.Reflections;
import static org.reflections.scanners.Scanners.*;
//import static org.reflections.ReflectionUtils.*;

import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    @SneakyThrows
    public Character createCharacter(){
        BasicConfigurator.configure();

        Reflections reflections = new Reflections("lotr");
        Set<Class<? extends Character>> allClasses = reflections.getSubTypesOf(Character.class);

        allClasses.remove(Nobel.class);

        return (Character) allClasses.toArray(new Class[0])[new Random().nextInt(allClasses.toArray().length)].getDeclaredConstructor().newInstance();
    }
}
