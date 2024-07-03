package ejercicio1;

import java.util.Iterator;

public class OrderPrinter {
    public OrderPrinter() {
    }

    public void printOrder(Order order) {
        System.out.println("Order:");
        Iterator var3 = order.getItems().iterator();

        while(var3.hasNext()) {
            String item = (String)var3.next();
            System.out.println(item);
        }

        System.out.println("Total amount: " + order.getTotalAmount());
    }
}
