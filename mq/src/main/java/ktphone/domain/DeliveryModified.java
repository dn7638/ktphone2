package ktphone.domain;

import java.time.LocalDate;
import java.util.*;
import ktphone.domain.*;
import ktphone.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryModified extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long customerId;
    private String productId;
    private String productName;
    private Integer qty;
    private String address;
    private String status;

    public DeliveryModified(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryModified() {
        super();
    }
}
//>>> DDD / Domain Event
