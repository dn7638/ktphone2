package ktphone.domain;

import java.time.LocalDate;
import java.util.*;
import ktphone.domain.*;
import ktphone.infra.AbstractEvent;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderModified extends AbstractEvent {

    private Long id;
    private String productId;
    private String productName;
    private Integer qty;
    private Long customerId;
    private String address;

    public OrderModified(CallBlockedDueToLost aggregate) {
        super(aggregate);
    }

    public OrderModified() {
        super();
    }
}
//>>> DDD / Domain Event
