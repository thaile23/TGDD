package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "Rom")
public class Rom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer romId;
    @Column(nullable = false)
    private String romName;

    public Integer getRomId() {
        return romId;
    }

    public void setRomId(Integer romId) {
        this.romId = romId;
    }

    public String getRomName() {
        return romName;
    }

    public void setRomName(String romName) {
        this.romName = romName;
    }
}
