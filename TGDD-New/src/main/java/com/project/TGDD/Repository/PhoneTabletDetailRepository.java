package com.project.TGDD.Repository;

import com.project.TGDD.Model.PhoneTabletDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneTabletDetailRepository extends CrudRepository<PhoneTabletDetail, Integer> {
}
