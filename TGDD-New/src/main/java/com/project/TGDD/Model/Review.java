package com.project.TGDD.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Review")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer reviewId;
    @Column(nullable = false)
    private Integer ProductId;

    @Column(nullable = false)
    private Integer numberPhone;

    @Column(nullable = false)
    private String name;

    private Float rate;

    @Column(nullable = false)
    private String reviewContent;
    private Integer ReviewStatus;
    private String pictureReview1;
    private String pictureReview2;
    private Date dateReview;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getProductId() {
        return ProductId;
    }

    public void setProductId(Integer productId) {
        ProductId = productId;
    }

    public Integer getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(Integer numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public void setReviewContent(String reviewContent) {
        this.reviewContent = reviewContent;
    }

    public Integer getReviewStatus() {
        return ReviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        ReviewStatus = reviewStatus;
    }

    public String getPictureReview1() {
        return pictureReview1;
    }

    public void setPictureReview1(String pictureReview1) {
        this.pictureReview1 = pictureReview1;
    }

    public String getPictureReview2() {
        return pictureReview2;
    }

    public void setPictureReview2(String pictureReview2) {
        this.pictureReview2 = pictureReview2;
    }

    public Date getDateReview() {
        return dateReview;
    }

    public void setDateReview(Date dateReview) {
        this.dateReview = dateReview;
    }
}
