package com.project.TGDD.Repository;

import com.project.TGDD.Model.RomProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RomProductRepository extends CrudRepository<RomProduct, Integer> {

}
