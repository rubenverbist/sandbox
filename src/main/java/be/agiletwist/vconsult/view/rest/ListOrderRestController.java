package be.agiletwist.vconsult.view.rest;

import be.agiletwist.vconsult.application.ordering.ListAllOrdersQuery;
import be.agiletwist.vconsult.application.ordering.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListOrderRestController {
    @Autowired
    private ListAllOrdersQuery listAllOrdersQuery;
    @Autowired
    private ListOrdersRestModelFactory listOrdersRestModelFactory;

    @RequestMapping("/orders")
    public ListOrdersRestModel findAllOrders(){
        List<OrderDTO> orderDTOS = listAllOrdersQuery.listAllOrders();
        return listOrdersRestModelFactory.create(orderDTOS);
    }

}
