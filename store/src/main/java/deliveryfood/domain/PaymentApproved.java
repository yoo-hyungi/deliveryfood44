package deliveryfood.domain;

import deliveryfood.domain.*;
import deliveryfood.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PaymentApproved extends AbstractEvent {

    private Long id;
    private String userId;
    private String orderId;
    private Long price;
    private String payStatus;
}
