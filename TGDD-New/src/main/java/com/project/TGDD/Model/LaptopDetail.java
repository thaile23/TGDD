package com.project.TGDD.Model;


import javax.persistence.*;

@Entity
@Table(name = "LaptopDetail")
public class LaptopDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer laptopId;

    @Column(nullable = false)
    private Integer productId;

    private String core;
    private String thread;
    private String cpu;
    private String cpuSpeed;
    private String ram;
    private String ramUpdate;
    private String screen;
    private String graphicCard;
    private String connector;
    private String especially;
    private String design;
    private String pin;
    private String sizeWeight;
    private String release;

    public Integer getLaptopId() {
        return laptopId;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setLaptopId(Integer laptopId) {
        this.laptopId = laptopId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(String cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRamUpdate() {
        return ramUpdate;
    }

    public void setRamUpdate(String ramUpdate) {
        this.ramUpdate = ramUpdate;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public String getEspecially() {
        return especially;
    }

    public void setEspecially(String especially) {
        this.especially = especially;
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
