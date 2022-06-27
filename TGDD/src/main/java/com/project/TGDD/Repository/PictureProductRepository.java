package com.project.TGDD.Repository;

import com.project.TGDD.Model.ColorProduct;
import com.project.TGDD.Model.PictureProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictureProductRepository  extends CrudRepository<PictureProduct, Integer> {
}
