package com.project.TGDD.Repository;

import com.project.TGDD.Model.ProductStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductStatusRepository extends CrudRepository<ProductStatus, Integer> {
}
