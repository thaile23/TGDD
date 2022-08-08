package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "Order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderDetailId;
    @Column(nullable = false)
    private Integer productId;

    @Column(nullable = false)
    private Integer orderId;

    @Column(nullable = false)
    private Integer quantity;

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
