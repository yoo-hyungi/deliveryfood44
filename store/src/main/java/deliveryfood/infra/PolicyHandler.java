package deliveryfood.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import deliveryfood.config.kafka.KafkaProcessor;
import deliveryfood.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    OrderManagementRepository orderManagementRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentApproved'"
    )
    public void wheneverPaymentApproved_ReceiveOrderInformation(
        @Payload PaymentApproved paymentApproved
    ) {
        PaymentApproved event = paymentApproved;
        System.out.println(
            "\n\n##### listener ReceiveOrderInformation : " +
            paymentApproved +
            "\n\n"
        );

        // Sample Logic //
        OrderManagement.receiveOrderInformation(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='PaymentCanceled'"
    )
    public void wheneverPaymentCanceled_OrderCancellationProcessing(
        @Payload PaymentCanceled paymentCanceled
    ) {
        PaymentCanceled event = paymentCanceled;
        System.out.println(
            "\n\n##### listener OrderCancellationProcessing : " +
            paymentCanceled +
            "\n\n"
        );

        // Sample Logic //
        OrderManagement.orderCancellationProcessing(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
