package be.agiletwist.vconsult.application.ordering;

import be.agiletwist.vconsult.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDTOMapper {
    @Autowired
    private PrescriberDTOMapper prescriberDTOMapper;
    public OrderDTO map(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderNumber(order.getOrderNumber().getValue());
        orderDTO.setPrescriber(prescriberDTOMapper.map(order.getPrescriber()));
        return orderDTO;
    }
}
