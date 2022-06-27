package com.project.TGDD.Model;

import javax.lang.model.element.Name;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="Color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer colorId;

    private String colorName;

    public Integer getColorId() {
        return colorId;
    }

    public void setColorId(Integer colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}
