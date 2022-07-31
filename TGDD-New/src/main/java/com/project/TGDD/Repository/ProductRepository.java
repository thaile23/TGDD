package com.project.TGDD.Repository;

import com.project.TGDD.Model.Color;
import com.project.TGDD.Model.Product;
import com.project.TGDD.Model.smartWatchDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
    @Query("select c from Color c inner join ColorProduct cp on c.colorId=cp.colorId where cp.productId = ?1")
    public List<Color> FindColorbyProductId(Integer productid);

    @Query("select p from Product p where p.categoryId = ?1")
    public List<Product> FindProductByCategory(Integer categoryId);

    @Query("select sw from smartWatchDetail sw where sw.productId = ?1")
    public smartWatchDetail FindSmartWatchByProId(Integer productid);
}

