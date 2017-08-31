package be.agiletwist.vconsult.view.rest;

import be.agiletwist.vconsult.application.ordering.AddAnalysisCommand;
import be.agiletwist.vconsult.infrastructure.ApplicationCommandBus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddAnalysisToOrderController {
    private ApplicationCommandBus applicationCommandBus;
    void addAnalysisToOrder(String orderNumber, AddAnalysisPayload addAnalysisPayload){
        AddAnalysisCommand addAnalysisCommand = new AddAnalysisCommand(orderNumber,addAnalysisPayload.getAnalysisNumber());
        applicationCommandBus.execute(addAnalysisCommand);
    }
}
