package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "phone_tablet_detail")
public class PhoneTabletDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer PhoneTabletId;
    @Column(nullable = false)
    private Integer productId;
    @Column(name = "'screen'")
    private String screen;
    @Column(name = "'resolution'")

    private String resolution;
    private String brightness;

    private String frontCamera;
    @Column(name = "'rear_camera'")

    private String rearCamera;
    private String chip;
    @Column(name = "'ram'")
    private String ram;
    @Column(name = "'sim'")
    private String sim;
    private String pin;
    private String design;
    @Column(name = "'size_weight'")
    private String sizeWeight;
    @Column(name = "'release'")
    private String release;

    public PhoneTabletDetail() {
    }

    public PhoneTabletDetail(Integer PhoneTabletId, String brightness, String chip, String design, String frontCamera, String pin, Integer productId, String ram, String rearCamera, String release, String resolution, String screen, String sim, String sizeWeight) {
        this.PhoneTabletId = PhoneTabletId;
        this.brightness = brightness;
        this.chip = chip;
        this.design = design;
        this.frontCamera = frontCamera;
        this.pin = pin;
        this.productId = productId;
        this.ram = ram;
        this.rearCamera = rearCamera;
        this.release = release;
        this.resolution = resolution;
        this.screen = screen;
        this.sim = sim;
        this.sizeWeight = sizeWeight;
    }


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
