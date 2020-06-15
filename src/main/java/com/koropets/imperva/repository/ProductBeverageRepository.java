package com.koropets.imperva.repository;

import com.koropets.imperva.entity.ProductBeverageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductBeverageRepository extends CrudRepository<ProductBeverageEntity, Long> {

}
