package com.project.TGDD.Model;


import javax.persistence.*;

@Entity
@Table(name = "ProductStatus")
public class ProductStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer productStatusId;

    private String productStatusName;

    public Integer getProductStatusId() {
        return productStatusId;
    }

    public void setProductStatusId(Integer productStatusId) {
        this.productStatusId = productStatusId;
    }

    public String getProductStatusName() {
        return productStatusName;
    }

    public void setProductStatusName(String productStatusName) {
        this.productStatusName = productStatusName;
    }
}
