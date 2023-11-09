package deliveryfood.infra;

import deliveryfood.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "orderDetails",
    path = "orderDetails"
)
public interface OrderDetailRepository
    extends PagingAndSortingRepository<OrderDetail, Long> {}
