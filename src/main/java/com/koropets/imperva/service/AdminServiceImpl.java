package com.koropets.imperva.service;

import com.koropets.imperva.dto.Beverage;
import com.koropets.imperva.dto.VendorMachine;
import com.koropets.imperva.mapper.BeverageMapper;
import com.koropets.imperva.mapper.VendorMachineMapper;
import com.koropets.imperva.repository.BeverageRepository;
import com.koropets.imperva.repository.VendorMachineRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final VendorMachineRepository vendorMachineRepository;
    private final BeverageRepository beverageRepository;
    private final VendorMachineMapper vendorMachineMapper;
    private final BeverageMapper beverageMapper;

    @Override
    public List<VendorMachine> getAllVendorMachines() {
        log.info("Getting all vendor machines");
        return vendorMachineMapper.toDto(vendorMachineRepository.findAll());
    }

    @Override
    public List<Beverage> getAllBeveragesByVendorMachine(String vendorMachineUuid) {
        log.info("Getting all beverages by vendor machine uuid = {}", vendorMachineUuid);
        return beverageMapper.toDto(beverageRepository.getBeverageEntitiesByVendorMachineUuid(vendorMachineUuid));
    }

    @Override
    public Beverage addBeverageToVendorMachine(Beverage beverage, String vendorMachineUuid) {
        log.info("Adding beverage {} to vendor machine uuid = {}", beverage, vendorMachineUuid);
//        List<BeverageEntity> persistedBeverages = beverageRepository.getBeverageEntitiesByVendorMachineUuid(vendorMachineUuid);
//        persistedBeverages.add(beverageMapper.toEntity(beverage));
        return null;
    }

    @Override
    public Beverage updatePrice(Beverage beverage, String vendorMachineUuid) {
        return null;
    }
}
