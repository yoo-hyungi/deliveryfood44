package deliveryfood.domain;

import deliveryfood.domain.*;
import deliveryfood.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String userId;
    private String foodname;
    private Integer qty;
    private String store;
    private Long price;
    private String orderId;
    private String address;
    private String status;

    public DeliveryStarted(OrderManagement aggregate) {
        super(aggregate);
    }

    public DeliveryStarted() {
        super();
    }
}
//>>> DDD / Domain Event
