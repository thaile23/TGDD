package com.project.TGDD.Model;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Enabled
@Table(name = "RomProduct")
public class RomProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer romProductId;
    @Column(nullable = false)
    private Integer romId;

    @Column(nullable = false)
    private Integer productId;

    public Integer getRomProductId() {
        return romProductId;
    }

    public void setRomProductId(Integer romProductId) {
        this.romProductId = romProductId;
    }

    public Integer getRomId() {
        return romId;
    }

    public void setRomId(Integer romId) {
        this.romId = romId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
