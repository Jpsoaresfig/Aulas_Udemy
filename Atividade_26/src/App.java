import java.sql.Date;
import Atividade_26.EntitiesEnum.OrderStatus;
import Atividade_26.entities.Order;

public class App {
    public static void main(String[] args) throws Exception {

        Order order = new Order(1, new Date(System.currentTimeMillis()), OrderStatus.PENDING_PAYMENT);


        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);

        
        System.out.println(order);
    }
}
