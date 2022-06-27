package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "SmartWatchDetail")
public class smartWatchDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer smartWatchDetailId;
    @Column(nullable = false)
    private Integer productId;
    private String screen;
    private String camera;
    private String chip;
    private String ram;
    private String sim;
    private String pin;
    private String release;

    public Integer getSmartWatchDetailId() {
        return smartWatchDetailId;
    }

    public void setSmartWatchDetailId(Integer smartWatchDetailId) {
        this.smartWatchDetailId = smartWatchDetailId;
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

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
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

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }
}
