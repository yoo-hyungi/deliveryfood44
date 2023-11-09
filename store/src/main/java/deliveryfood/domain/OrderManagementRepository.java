package deliveryfood.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import deliveryfood.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="orderManagements", path="orderManagements")
public interface OrderManagementRepository extends PagingAndSortingRepository<OrderManagement, >{
}