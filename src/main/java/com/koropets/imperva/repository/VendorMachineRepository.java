package com.koropets.imperva.repository;

import com.koropets.imperva.entity.VendorMachineEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VendorMachineRepository extends CrudRepository<VendorMachineEntity, Long> {
    Optional<VendorMachineEntity> findByUuid(String uuid);
    List<VendorMachineEntity> findAll();
    void deleteByUuid(String uuid);
}
