package ktphone.domain;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.persistence.*;
import ktphone.PhonemanageApplication;
import lombok.Data;

@Entity
@Table(name = "CallBlockedDueToLost_table")
@Data
//<<< DDD / Aggregate Root
public class CallBlockedDueToLost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productId;

    private String productName;

    private Integer qty;

    private Long customerId;

    private String address;

    public static CallBlockedDueToLostRepository repository() {
        CallBlockedDueToLostRepository callBlockedDueToLostRepository = PhonemanageApplication.applicationContext.getBean(
            CallBlockedDueToLostRepository.class
        );
        return callBlockedDueToLostRepository;
    }
}
//>>> DDD / Aggregate Root
