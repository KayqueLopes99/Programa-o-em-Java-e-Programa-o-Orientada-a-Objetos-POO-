package Udemy.Aula_26_Enumerações_Composição_Design;
import java.util.Date;

public class DemoOrder {
    public static void main(String[] args) {
        Order order = new Order(180, new Date(), ExemploEnum.PENDING_PAYMENT);
        System.out.println(order);

        ExemploEnum os1 = status.DELIVERED;
        ExemploEnum os2 = ExemploEnum.valueOf("DELIVERED");

        System.out.println(os1 + " | " + os2);


    }
}
