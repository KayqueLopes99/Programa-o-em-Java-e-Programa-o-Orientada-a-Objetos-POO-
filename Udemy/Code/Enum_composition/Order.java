package Udemy.Code.Enum_composition;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> listProduct = new ArrayList<>();

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public static Order registerOrder(Scanner scanner) {
        OrderStatus status = null;

        while (status == null) {
            System.out.println("Status of the order (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
            String input = scanner.nextLine().toUpperCase();
            try {
                status = OrderStatus.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Status inválido! Tente novamente.");
            }
        }

        System.out.println("How many items to this order? ");
        int quantityItensForAdd = scanner.nextInt();
        int indexProducts = 1;

        Order order = new Order(LocalDateTime.now(), status);
        while (quantityItensForAdd != 0) {
            System.out.println("Enter #" + indexProducts + " item data:");

            System.out.println("Product Id: ");
            int idProduct = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Product Name: ");
            String nameProduct = scanner.next();

            System.out.println("Product Price: ");
            double priceProduct = scanner.nextDouble();

            System.out.println("Product Quantity: ");
            int quantityProduct = scanner.nextInt();
            OrderItem item = new OrderItem(idProduct, nameProduct, priceProduct, quantityProduct);
            order.addItem(item);

            quantityItensForAdd--;
            indexProducts++;
            scanner.nextLine();

        }

        return order;
    }

    public void addItem(OrderItem item) {
        boolean sucess = listProduct.add(item);
        if (sucess) {
            System.out.println("Produto adicionado na lista com sucesso.");
        } else {
            System.out.println("ERRO: não foi possível adicionar o produto na lista.");
        }
    }

    public void listItens() {
        if (!listProduct.isEmpty()) {
            System.out.println("---- PRODUTOS DO CLIENTE ----");
            for (OrderItem orderItem : listProduct) {
                System.out.println(orderItem);
            }
            System.out.println("Total price R$: " + total());
        } else {
            System.out.println("Nenhum produto cadastrado na lista.");
        }
    }

    public void removeItemById(int idItem) {
        boolean sucess = false;
        // Percorrer de trás para frente
        for (int i = listProduct.size() - 1; i >= 0; i--) {
            if (listProduct.get(i).getId() == idItem) {
                listProduct.remove(i);
                sucess = true;
                break;
            }
        }

        if (sucess) {
            System.out.println("Produto removido da lista com sucesso.");
        } else {
            System.out.println("ERRO: Produto não encontrado na lista.");
        }
    }

    public static void removeItemsFromOrder(Order order, Scanner scanner) {
        System.out.println("Remove some items (YES/NO)?");
        String response1 = scanner.nextLine().toUpperCase();

        if (response1.equals("YES")) {
            while (true) {
                System.out.println("\nRemove Products:");
                order.listItens();

                System.out.print("Product Id: ");
                int idProduct = scanner.nextInt();
                scanner.nextLine();

                order.removeItemById(idProduct);

                System.out.print("Exit? (YES/NO): ");
                String response2 = scanner.nextLine().toUpperCase();

                if (response2.equals("YES")) {
                    break;
                }
            }
        }
    }

    public double total() {
        double sum = 0.0;
        for (OrderItem item : listProduct) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Order moment: " + moment + "\nOrder status: " + status;
    }
}
