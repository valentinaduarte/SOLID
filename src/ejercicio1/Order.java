package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items;
    private OrderCalculator calculator;

    public Order(List<String> items, OrderCalculator calculator) {
        this.items = new ArrayList(items);
        this.calculator = calculator;
    }

    public List<String> getItems() {
        return this.items;
    }

    public double getTotalAmount() {
        return this.calculator.calculateTotal(this.items);
    }
}
