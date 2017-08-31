package be.agiletwist.vconsult.data;

import be.agiletwist.vconsult.domain.Order;
import be.agiletwist.vconsult.domain.OrderNumber;
import be.agiletwist.vconsult.domain.OrderRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("production")
public class OrderSqlRepository implements OrderRepository {
    @Override
    public void save(Order order) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Order getOrder(OrderNumber orderNumber) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Order> findAll() {
        throw new UnsupportedOperationException();
    }
}
