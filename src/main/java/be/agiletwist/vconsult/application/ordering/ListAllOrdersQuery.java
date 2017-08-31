package be.agiletwist.vconsult.application.ordering;

import be.agiletwist.vconsult.domain.Order;
import be.agiletwist.vconsult.domain.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListAllOrdersQuery {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDTOMapper orderDTOMapper;

    public List<OrderDTO> listAllOrders(){
        List<Order> orders = orderRepository.findAll();
        return orders.stream().map(order -> { return orderDTOMapper.map(order);}).collect(Collectors.toList());
    }
}
