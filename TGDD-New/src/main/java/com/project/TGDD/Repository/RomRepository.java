package com.project.TGDD.Repository;

import com.project.TGDD.Model.Rom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RomRepository extends CrudRepository<Rom, Integer> {
}
