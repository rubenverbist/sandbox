package be.agiletwist.vconsult.view.rest;

public class OrderRestModel {
    private String  orderNumber;
    private PrescriberRestModel prescriberRestModel;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public PrescriberRestModel getPrescriberRestModel() {
        return prescriberRestModel;
    }

    public void setPrescriberRestModel(PrescriberRestModel prescriberRestModel) {
        this.prescriberRestModel = prescriberRestModel;
    }
}
