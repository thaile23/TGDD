package com.project.TGDD.Repository;

import com.project.TGDD.Model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepoSortPage extends PagingAndSortingRepository<Product, Long> {
    @Query("SELECT p FROM Product p WHERE CONCAT(p.name, ' ', p.price) LIKE %?1%")
    public Page<Product> findAll(String keyword, Pageable pageable);
}
