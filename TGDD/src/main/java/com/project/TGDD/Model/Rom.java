package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "Rom")
public class Rom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer romId;
    @Column(nullable = false)
    private Integer romDetail;

    public Integer getRomId() {
        return romId;
    }

    public void setRomId(Integer romId) {
        this.romId = romId;
    }

    public Integer getRomDetail() {
        return romDetail;
    }

    public void setRomDetail(Integer romDetail) {
        this.romDetail = romDetail;
    }
}
