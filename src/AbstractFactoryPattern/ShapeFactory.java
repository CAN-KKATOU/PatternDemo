package AbstractFactoryPattern;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory extends AbstractFactory {

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
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null)
            return null;

        try {
            return (AbstractFactoryPattern.Shape) factories.
                    computeIfAbsent(shape, AbstractFactoryPattern.ShapeFactory::load).
                    newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
