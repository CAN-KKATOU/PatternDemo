package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private final List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (var order : orderList)
            order.execute();
        orderList.clear();
    }
}
