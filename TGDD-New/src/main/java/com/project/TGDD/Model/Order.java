package com.project.TGDD.Model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Order_user")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;
    @Column(nullable = false)
    private Integer numberPhone;
    @Column(nullable = false)
    private String name;

    private String address;
    @Column(nullable = false)
    private String createAt;
    private Date dateOrder;
    @Column(nullable = false)
    private Integer orderStatusId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Integer numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Integer getOrderStatusId() {
        return orderStatusId;
    }

    public void setOrderStatusId(Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }
}
