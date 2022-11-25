package CommandPattern;

public class BuyStock implements Order {

    private final Stock abcStock;

    public BuyStock(Stock stock) {
        this.abcStock = stock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
