package com.project.TGDD.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SmartWatchDetail")
public class smartWatchDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer smartWatchId;
    @Column(nullable = false)
    private Integer productId;
    private String screen;
    private String resolution;
    private String material_frame;
    private String material_strap;
    private String material_surface;
    private String size;
    private String pin_time;
    private String charge;
    private String pin;
    private String release;

    public Integer getSmartWatchId() {
        return smartWatchId;
    }

    public void setSmartWatchId(Integer smartWatchId) {
        this.smartWatchId = smartWatchId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getMaterial_frame() {
        return material_frame;
    }

    public void setMaterial_frame(String material_frame) {
        this.material_frame = material_frame;
    }

    public String getMaterial_strap() {
        return material_strap;
    }

    public void setMaterial_strap(String material_strap) {
        this.material_strap = material_strap;
    }

    public String getMaterial_surface() {
        return material_surface;
    }

    public void setMaterial_surface(String material_surface) {
        this.material_surface = material_surface;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPin_time() {
        return pin_time;
    }

    public void setPin_time(String pin_time) {
        this.pin_time = pin_time;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }
}
