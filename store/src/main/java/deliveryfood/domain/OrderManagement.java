package deliveryfood.domain;

import deliveryfood.StoreApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "OrderManagement_table")
@Data
//<<< DDD / Aggregate Root
public class OrderManagement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String foodname;

    private Integer qty;

    private String store;

    private Long price;

    private String orderId;

    private String address;

    private String status;

    public static OrderManagementRepository repository() {
        OrderManagementRepository orderManagementRepository = StoreApplication.applicationContext.getBean(
            OrderManagementRepository.class
        );
        return orderManagementRepository;
    }

    //<<< Clean Arch / Port Method
    public static void receiveOrderInformation(
        PaymentApproved paymentApproved
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        DeliveryStarted deliveryStarted = new DeliveryStarted(orderManagement);
        deliveryStarted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(paymentApproved.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);

            DeliveryStarted deliveryStarted = new DeliveryStarted(orderManagement);
            deliveryStarted.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void orderCancellationProcessing(
        PaymentCanceled paymentCanceled
    ) {
        //implement business logic here:

        /** Example 1:  new item 
        OrderManagement orderManagement = new OrderManagement();
        repository().save(orderManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentCanceled.get???()).ifPresent(orderManagement->{
            
            orderManagement // do something
            repository().save(orderManagement);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
