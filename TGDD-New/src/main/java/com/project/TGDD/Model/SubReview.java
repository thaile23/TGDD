package com.project.TGDD.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "SubReview")
public class SubReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer subReviewId;
    @Column(nullable = false)
    private Integer reviewId;
    @Column(nullable = false)

    private String name;
    @Column(nullable = false)

    private Integer numberPhone;
    @Column(nullable = false)
    private String SubReviewContent;
    private Date subReviewDate;

    public Date getSubReviewDate() {
        return subReviewDate;
    }

    public void setSubReviewDate(Date subReviewDate) {
        this.subReviewDate = subReviewDate;
    }

    public Integer getSubReviewId() {
        return subReviewId;
    }

    public void setSubReviewId(Integer subReviewId) {
        this.subReviewId = subReviewId;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Integer numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getSubReviewContent() {
        return SubReviewContent;
    }

    public void setSubReviewContent(String subReviewContent) {
        SubReviewContent = subReviewContent;
    }
}
