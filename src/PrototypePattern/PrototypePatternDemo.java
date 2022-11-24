package PrototypePattern;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        var shape1 = ShapeCache.getShape("1");
        System.out.println("Shape: " + shape1.getType());

        var shape2 = ShapeCache.getShape("2");
        System.out.println("Shape: " + shape2.getType());

        var shape3 = ShapeCache.getShape("3");
        System.out.println("Shape: " + shape3.getType());
    }
}
