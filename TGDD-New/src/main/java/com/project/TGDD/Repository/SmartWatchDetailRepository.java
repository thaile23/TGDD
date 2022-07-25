package com.project.TGDD.Repository;

import com.project.TGDD.Model.smartWatchDetail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartWatchDetailRepository extends CrudRepository<smartWatchDetail, Integer> {
}
