package be.agiletwist.vconsult.domain;

import java.util.List;

public class Order {
    private OrderNumber orderNumber;
    private List<Analysis> analyses;
    private Prescriber prescriber;

    private Order() {
    }

    public static Builder newOrder() {
        return new Builder();
    }

    public void addAnalysis(Analysis analysis){
        if(analyses.contains(analysis)){
            throw new DomainException("Analysis cannot be added twice");
        }
        analyses.add(analysis);
    }

    public OrderNumber getOrderNumber() {
        return orderNumber;
    }

    public List<Analysis> getAnalyses() {
        return analyses;
    }

    public Prescriber getPrescriber() {
        return prescriber;
    }


    public static class Builder {
        private Order order = new Order();

        public Order build() {
            return this.order;
        }

        public Builder withOrderNumber(OrderNumber orderNumber) {
            order.orderNumber = orderNumber;
            return this;
        }

        public Builder withAnalyses(List<Analysis> analyses) {
            order.analyses = analyses;
            return this;
        }

        public Builder withPrescriber(Prescriber prescriber) {
            order.prescriber = prescriber;
            return this;
        }
    }
}
