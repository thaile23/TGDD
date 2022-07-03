package com.project.TGDD.Model;

import javax.persistence.*;

@Entity
@Table(name = "Picture_review")
public class PictureReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pictureReviewId;

    @Column(nullable = false)
    private Integer reviewId;

    @Column(nullable = false)
    private String pictureReviewLink;

    public Integer getPictureReviewId() {
        return pictureReviewId;
    }

    public void setPictureReviewId(Integer pictureReviewId) {
        this.pictureReviewId = pictureReviewId;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getPictureReviewLink() {
        return pictureReviewLink;
    }

    public void setPictureReviewLink(String pictureReviewLink) {
        this.pictureReviewLink = pictureReviewLink;
    }
}
