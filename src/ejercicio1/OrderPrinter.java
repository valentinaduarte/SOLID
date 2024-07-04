package ejercicio1;

public class OrderPrinter {
    public OrderPrinter() {
    }

    public void printOrder(Order order) {
        System.out.println("Order:");
        for (String item : order.getItems()) {
            System.out.println(item);
        }
        System.out.println("Total amount: " + order.getTotalAmount());
    }
}
