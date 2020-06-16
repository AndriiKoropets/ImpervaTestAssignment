package com.koropets.imperva.repository;

import com.koropets.imperva.entity.VendorMachineEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendorMachineRepository extends CrudRepository<VendorMachineEntity, Long> {
    List<VendorMachineEntity> findAll();
}
