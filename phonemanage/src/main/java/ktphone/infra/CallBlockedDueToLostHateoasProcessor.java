package ktphone.infra;

import ktphone.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CallBlockedDueToLostHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CallBlockedDueToLost>> {

    @Override
    public EntityModel<CallBlockedDueToLost> process(
        EntityModel<CallBlockedDueToLost> model
    ) {
        return model;
    }
}
