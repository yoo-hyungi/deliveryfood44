package deliveryfood.infra;

import deliveryfood.config.kafka.KafkaProcessor;
import deliveryfood.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    //>>> DDD / CQRS
}
