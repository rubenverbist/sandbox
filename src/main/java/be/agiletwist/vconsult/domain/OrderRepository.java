package be.agiletwist.vconsult.domain;

import java.util.List;

public interface OrderRepository {
    public void save(Order order);
    public Order getOrder(OrderNumber orderNumber);

    List<Order> findAll();
}
