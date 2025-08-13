package Udemy.Code.Enum_composition;
import java.util.Scanner;

public class DemoOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client client = Client.registerClient(scanner);
        Order order = Order.registerOrder(scanner);
        Order.removeItemsFromOrder(order, scanner);


        System.out.println("====================================");
        System.out.println("      -- > ORDER SUMMARY <--        ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client date:" + client);
        System.out.println("Order Itens:");
        order.listItens();
        System.out.println("====================================");

        scanner.close();

    }
}
