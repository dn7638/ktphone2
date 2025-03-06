package ktphone.domain;

import ktphone.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "callBlockedDueToLosts",
    path = "callBlockedDueToLosts"
)
public interface CallBlockedDueToLostRepository
    extends PagingAndSortingRepository<CallBlockedDueToLost, Long> {}
