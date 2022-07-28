package com.project.TGDD.Repository;

import com.project.TGDD.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface TabletFilterHSXRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p where p.categoryId = ?1 and p.manufacturerId = ?2")

    public List<Product> findByCateAndManu (Integer categoryId, Integer manufacturerId);

}
