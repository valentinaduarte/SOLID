package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private double totalAmount;

    public Order(List<String> items) {
        this.items = new ArrayList(items);
        this.totalAmount = OrderCalculator.calculateTotal(items);
    }

    public List<String> getItems() {
        return this.items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
