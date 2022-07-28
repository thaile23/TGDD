package com.project.TGDD.Repository;

import com.project.TGDD.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccessoryRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p  WHERE CONCAT(p.categoryId, '') LIKE %?1%")
    public List<Product> search(String keyword);
}
