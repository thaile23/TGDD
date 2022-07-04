package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "PhoneTabletDetail")
public class PhoneTabletDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer PhoneTabletId;
    @Column(nullable = false)
    private Integer productId;
    private String screen;
    private String resolution;
    private String brightness;
    private String frontCamera;
    private String rearCamera;
    private String chip;
    private String ram;
    private String sim;
    private String pin;
    private String design;
    private String sizeWeight;
    private String release;

    public Integer getPhoneTabletDetailId() {
        return PhoneTabletId;
    }

    public void setPhoneTabletDetailId(Integer phoneTabletDetailId) {
        PhoneTabletId = phoneTabletDetailId;
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

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public String getFrontCamera() {
        return frontCamera;
    }

    public void setFrontCamera(String frontCamera) {
        this.frontCamera = frontCamera;
    }

    public String getRearCamera() {
        return rearCamera;
    }

    public void setRearCamera(String rearCamera) {
        this.rearCamera = rearCamera;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getSizeWeight() {
        return sizeWeight;
    }

    public void setSizeWeight(String sizeWeight) {
        this.sizeWeight = sizeWeight;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }
}
