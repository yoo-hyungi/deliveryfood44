package deliveryfood.domain;

import deliveryfood.PayApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "PaymentHistory_table")
@Data
//<<< DDD / Aggregate Root
public class PaymentHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String orderId;

    private Long price;

    private String payStatus;

    public static PaymentHistoryRepository repository() {
        PaymentHistoryRepository paymentHistoryRepository = PayApplication.applicationContext.getBean(
            PaymentHistoryRepository.class
        );
        return paymentHistoryRepository;
    }
}
//>>> DDD / Aggregate Root
