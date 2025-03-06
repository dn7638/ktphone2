package ktphone.domain;

import java.util.*;
import ktphone.domain.*;
import ktphone.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderModified extends AbstractEvent {

    private Long id;
    private String productId;
    private String productName;
    private Integer qty;
    private Long customerId;
    private String address;
}
