package com.koropets.imperva.repository;

import com.koropets.imperva.entity.BeverageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeverageRepository extends CrudRepository<Long, BeverageEntity> {
}
