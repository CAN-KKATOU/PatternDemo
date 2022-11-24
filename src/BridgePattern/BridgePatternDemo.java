package BridgePattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        var redCircle = new Circle(100, 100, 10, new RedCircle());
        var greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
