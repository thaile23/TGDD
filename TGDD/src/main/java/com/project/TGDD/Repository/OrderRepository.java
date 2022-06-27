package com.project.TGDD.Repository;

import com.project.TGDD.Model.ColorProduct;
import com.project.TGDD.Model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository  extends CrudRepository<Order, Integer> {
}
