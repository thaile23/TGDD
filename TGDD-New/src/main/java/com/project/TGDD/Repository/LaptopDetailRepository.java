package com.project.TGDD.Repository;

import com.project.TGDD.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDetailRepository extends CrudRepository<Product, Integer> {
}
