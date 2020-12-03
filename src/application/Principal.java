package application;
import entities.Pedido;
import entitiesEnum.OrderStatus;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
        System.out.println(pedido);

        OrderStatus orderTipo1 = OrderStatus.ENTREGUE_DELIVERED;
        OrderStatus orderTipo2 = OrderStatus.valueOf("ENTREGUE_DELIVERED");

        System.out.println(orderTipo1);
        System.out.println(orderTipo2);


    }
}
