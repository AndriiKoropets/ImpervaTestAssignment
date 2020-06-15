package com.koropets.imperva.service;

import com.koropets.imperva.dto.Beverage;
import com.koropets.imperva.dto.VendorMachine;
import com.koropets.imperva.mapper.VendorMachineMapper;
import com.koropets.imperva.repository.BeverageRepository;
import com.koropets.imperva.repository.ProductBeverageRepository;
import com.koropets.imperva.repository.VendorMachineRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final ProductBeverageRepository productBeverageRepository;
    private final VendorMachineRepository vendorMachineRepository;
    private final VendorMachineMapper vendorMachineMapper;

    @Override
    public List<VendorMachine> getAllVendorMachines() {
        log.info("Getting all vendor machines");
        return vendorMachineMapper.toDto(vendorMachineRepository.findAll());
    }

    @Override
    public List<Beverage> getAllBeveragesByVendorMachine(String vendorMachineUuid) {
        return null;
    }

    @Override
    public Beverage addBeverageToVendorMachine(Beverage beverage, String vendorMachineUuid) {
        return null;
    }

    @Override
    public Beverage updatePrice(Beverage beverage, String vendorMachineUuid) {
        return null;
    }
}
