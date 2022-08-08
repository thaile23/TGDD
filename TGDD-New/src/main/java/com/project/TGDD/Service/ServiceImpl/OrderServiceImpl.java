package com.project.TGDD.Service.ServiceImpl;

import com.project.TGDD.Model.Order;
import com.project.TGDD.Model.OrderDetail;
import com.project.TGDD.Repository.OrderDetailRepository;
import com.project.TGDD.Repository.OrderRepository;
import com.project.TGDD.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderRepository orderRepository;
    @Autowired
    OrderDetailRepository orderDetailRepository;

    @Override
    public void addOrder(Order order, OrderDetail orderDetail) {
        Date date = new Date();
        order.setDateOrder(date);
        order.setCreateAt(order.getAddress());
        order.setOrderStatusId(1);
        orderRepository.save(order);
        orderDetail.setOrderId(order.getOrderId());
        orderDetailRepository.save(orderDetail);
    }

    @Override
    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }
}
