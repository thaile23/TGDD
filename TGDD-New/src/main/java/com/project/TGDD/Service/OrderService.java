package com.project.TGDD.Service;

import com.project.TGDD.Model.Order;
import com.project.TGDD.Model.OrderDetail;

public interface OrderService {
    void addOrder(Order order,OrderDetail orderDetail);
    void addOrderDetail(OrderDetail orderDetail);
}
