package FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.create("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.create("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.create("Square");
        shape3.draw();
    }
}
