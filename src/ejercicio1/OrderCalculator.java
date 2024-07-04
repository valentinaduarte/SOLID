package ejercicio1;
import java.util.List;

public class OrderCalculator {
    public OrderCalculator() {
    }

    public static double calculateTotal(List<String> items) {
        // Lógica para calcular el total de la orden
        double total = 0.0;
        for (String item : items) {
            // Logica para calcular el total de los items .
            total += getPrice(item);
        }
        return total;
    }

    private static double getPrice(String item) {
       double price = Math.random();
        return price;
    }
}