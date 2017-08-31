package be.agiletwist.vconsult.application.ordering;

import be.agiletwist.vconsult.domain.Order;
import be.agiletwist.vconsult.domain.OrderNumber;
import be.agiletwist.vconsult.domain.PoctAnalysis;
import be.agiletwist.vconsult.infrastructure.Command;
import be.agiletwist.vconsult.domain.OrderRepository;

public class AddAnalysisCommand implements Command {
    private final String orderNumber;
    private String analysisNumber;
    private OrderRepository orderRepository;


    public AddAnalysisCommand(String orderNumber , String analysisNumber) {
        this.orderNumber= orderNumber;
        this.analysisNumber = analysisNumber;
    }

    @Override
    public void execute() {
        Order order = orderRepository.getOrder(new OrderNumber(orderNumber));
        PoctAnalysis poctAnalysis = new PoctAnalysis();
        order.addAnalysis(poctAnalysis);
        orderRepository.save(order);
    }

    public String getAnalysisNumber() {
        return analysisNumber;
    }
}
