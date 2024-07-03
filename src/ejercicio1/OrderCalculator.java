package ejercicio1;
import java.util.Iterator;
import java.util.List;

public class OrderCalculator {
    public OrderCalculator() {
    }

    public double calculateTotal(List<String> items) {
        double total = 0.0;

        String item;
        for(
        Iterator var5 = items.iterator(); var5.hasNext(); total += this.getPrice(item)) {
            item = (String)var5.next();
        }

        return total;
    }

    private double getPrice(String item) {
        double price = Math.random();
        return price;
    }
}
