package com.project.TGDD.Repository;

import com.project.TGDD.Model.SubReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubReviewRepository extends CrudRepository<SubReview, Integer> {
}
