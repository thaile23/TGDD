package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "PictureProduct")
public class PictureProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pictureId;
    @Column(nullable = false)
    private Integer productId;
    private String pictureLink;

    public Integer getPictureId() {
        return pictureId;
    }

    public void setPictureId(Integer pictureId) {
        this.pictureId = pictureId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }
}
