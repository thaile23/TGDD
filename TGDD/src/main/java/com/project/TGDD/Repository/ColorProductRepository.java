package com.project.TGDD.Repository;

import com.project.TGDD.Model.Category;
import com.project.TGDD.Model.ColorProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorProductRepository  extends CrudRepository<ColorProduct, Integer> {
}
