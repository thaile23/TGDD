package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name="ColorProduct")
public class ColorProduct {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer colorProductId;

@Column(nullable = false)
    private Integer colorId;

    @Column(nullable = false)

    private Integer productId;

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
