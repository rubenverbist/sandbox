package be.agiletwist.vconsult.view.rest;

import be.agiletwist.vconsult.application.ordering.OrderDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListOrdersRestModelFactory {
    public ListOrdersRestModel create(List<OrderDTO> orderDTOS){
        List<OrderRestModel> orderRestModels = orderDTOS.stream().map(orderDTO -> {
            OrderRestModel orderRestModel = new OrderRestModel();
            orderRestModel.setOrderNumber(orderDTO.getOrderNumber());
            PrescriberRestModel prescriberRestModel = new PrescriberRestModel();
            prescriberRestModel.setName(orderDTO.getPrescriber().getName());
            prescriberRestModel.setNumber(orderDTO.getPrescriber().getNumber());
            orderRestModel.setPrescriberRestModel(prescriberRestModel);
            return orderRestModel;
        }).collect(Collectors.toList());

        ListOrdersRestModel listOrdersRestModel = new ListOrdersRestModel();
        listOrdersRestModel.setOrderRestModel(orderRestModels);
        return listOrdersRestModel;
    }
}
