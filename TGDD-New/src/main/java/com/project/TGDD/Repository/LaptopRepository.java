package com.project.TGDD.Repository;

import com.project.TGDD.Model.LaptopDetail;
import com.project.TGDD.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p  WHERE CONCAT(p.categoryId, '') LIKE %?1%")
    public List<Product> search(String keyword);
}

