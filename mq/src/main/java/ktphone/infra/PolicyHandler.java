package ktphone.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import ktphone.config.kafka.KafkaProcessor;
import ktphone.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='LostReported'"
    )
    public void wheneverLostReported_LostEvent(
        @Payload LostReported lostReported
    ) {
        LostReported event = lostReported;
        System.out.println(
            "\n\n##### listener LostEvent : " + lostReported + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderModified'"
    )
    public void wheneverOrderModified_ModifyDelivery(
        @Payload OrderModified orderModified
    ) {
        OrderModified event = orderModified;
        System.out.println(
            "\n\n##### listener ModifyDelivery : " + orderModified + "\n\n"
        );

        // Sample Logic //
        Delivery.modifyDelivery(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='OrderCancelled'"
    )
    public void wheneverOrderCancelled_CancelDelivery(
        @Payload OrderCancelled orderCancelled
    ) {
        OrderCancelled event = orderCancelled;
        System.out.println(
            "\n\n##### listener CancelDelivery : " + orderCancelled + "\n\n"
        );

        // Sample Logic //
        Delivery.cancelDelivery(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
