package test.service.Repository;

import org.springframework.data.repository.CrudRepository;
import test.service.Classes.Order.Order;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
