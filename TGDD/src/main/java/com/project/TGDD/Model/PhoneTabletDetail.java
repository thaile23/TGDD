package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "PhoneTabletDetail")
public class PhoneTabletDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer PhoneTabletDetailId;
    @Column(nullable = false)
    private Integer productId;
    private String screen;
    private String screenTechnology;
    private String resolution;
    private String wideScreen;
    private String brightness;
    private String touchScreen;
    private String frontCamera;
    private String rearCamera;
    private String chip;
    private String chipSpeed;
    private String chipGraphic;
    private String ram;
    private String material;
    private String release;
    private String sim;
    private String sizeWeight;

    public Integer getProductId() {
        return productId;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
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

    public String getScreenTechnology() {
        return screenTechnology;
    }

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getWideScreen() {
        return wideScreen;
    }

    public void setWideScreen(String wideScreen) {
        this.wideScreen = wideScreen;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public String getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(String touchScreen) {
        this.touchScreen = touchScreen;
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

    public String getChipSpeed() {
        return chipSpeed;
    }

    public void setChipSpeed(String chipSpeed) {
        this.chipSpeed = chipSpeed;
    }

    public Integer getPhoneTabletDetailId() {
        return PhoneTabletDetailId;
    }

    public void setPhoneTabletDetailId(Integer phoneTabletDetailId) {
        PhoneTabletDetailId = phoneTabletDetailId;
    }

    public String getChipGraphic() {
        return chipGraphic;
    }

    public void setChipGraphic(String chipGraphic) {
        this.chipGraphic = chipGraphic;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getSizeWeight() {
        return sizeWeight;
    }

    public void setSizeWeight(String sizeWeight) {
        this.sizeWeight = sizeWeight;
    }
}
