package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "Color_product")
public class ColorProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer colorProductId;

    @Column(nullable = false)
    private Integer colorId;

    @Column(nullable = false)

    private Integer productId;

    public ColorProduct() {
    }

    public ColorProduct(Integer colorProductId, Integer colorId, Integer productId) {
        this.colorProductId = colorProductId;
        this.colorId = colorId;
        this.productId = productId;
    }

    public Integer getColorProductId() {
        return colorProductId;
    }

    public void setColorProductId(Integer colorProductId) {
        this.colorProductId = colorProductId;
    }

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
