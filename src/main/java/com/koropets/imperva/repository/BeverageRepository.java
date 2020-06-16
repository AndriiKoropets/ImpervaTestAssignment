package com.koropets.imperva.repository;

import com.koropets.imperva.entity.BeverageEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeverageRepository extends CrudRepository<BeverageEntity, Long> {
    @Query("SELECT distinct b from BeverageEntity b " +
            "inner join fetch  b.vendorMachine vm " +
            "where vm.uuid = ?1 ")
    List<BeverageEntity> getBeverageEntitiesByVendorMachineUuid(String vendorMachineUuid);
}
