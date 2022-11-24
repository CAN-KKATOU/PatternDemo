package DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        var circle = new Circle();

        var redCircle = new RedShapeDecorator(new Circle());
        var redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
