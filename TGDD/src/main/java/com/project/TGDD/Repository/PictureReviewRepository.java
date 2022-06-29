package com.project.TGDD.Repository;

import com.project.TGDD.Model.PictureReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureReviewRepository extends CrudRepository<PictureReview, Integer> {
}
