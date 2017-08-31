package be.agiletwist.vconsult.stub;

import be.agiletwist.vconsult.domain.*;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static be.agiletwist.vconsult.domain.Order.newOrder;
@Component
@Profile("stub")
public class OrderStubRepository implements OrderRepository {
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
        List<Order> orders = new ArrayList<Order>();
        Prescriber prescriber = Prescriber
                    .newPrescriber()
                    .withDoctorNumber(new DoctorNumber("21321313"))
                    .withName("Dokter Dre")
                    .build();

        orders.add(newOrder()
                        .withOrderNumber(new OrderNumber("2874917249"))
                        .withPrescriber(prescriber)
                    .build());
        orders.add(newOrder()
                .withOrderNumber(new OrderNumber("789079879"))
                .withPrescriber(prescriber)
                .build());

        return orders;
    }
}
