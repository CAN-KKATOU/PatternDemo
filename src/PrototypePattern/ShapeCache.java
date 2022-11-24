package PrototypePattern;

import java.util.Hashtable;

public class ShapeCache {

    private static final Hashtable<String, Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        var cachedShape = shapeMap.get(shapeId);
        return cachedShape.clone();
    }

    public static void loadCache() {
        var circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        var square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        var rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
