package FactoryPattern;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private final Map<String, Constructor<?>> factories = new HashMap<>();

    private static Constructor<?> load(String id) {
        System.out.println("Loading " + id);
        try {
            return Class.forName("FactoryPattern." + id).getConstructor();
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public Shape create(String shapeType) {
        if (shapeType == null)
            return null;

        try {
            return (Shape) factories.computeIfAbsent(shapeType, ShapeFactory::load).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
