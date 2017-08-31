package be.agiletwist.vconsult.view.rest;

import java.util.List;

public class ListOrdersRestModel {
    private List<OrderRestModel> orderRestModel;

    public List<OrderRestModel> getOrderRestModel() {
        return orderRestModel;
    }

    public void setOrderRestModel(List<OrderRestModel> orderRestModel) {
        this.orderRestModel = orderRestModel;
    }
}
