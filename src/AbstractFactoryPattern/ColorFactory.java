package AbstractFactoryPattern;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class ColorFactory extends AbstractFactory {

    private final Map<String, Constructor<?>> factories = new HashMap<>();

    private static Constructor<?> load(String id) {
        System.out.println("Loading " + id);
        try {
            return Class.forName("AbstractFactoryPattern." + id).getConstructor();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Color getColor(String color) {
        if (color == null)
            return null;

        try {
            return (AbstractFactoryPattern.Color) factories.
                    computeIfAbsent(color, AbstractFactoryPattern.ColorFactory::load).
                    newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
