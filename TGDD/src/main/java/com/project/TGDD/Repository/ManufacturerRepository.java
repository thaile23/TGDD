package com.project.TGDD.Repository;

import com.project.TGDD.Model.Manufacturer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Integer> {
}
