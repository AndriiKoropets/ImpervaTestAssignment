package com.koropets.imperva.mapper;

import com.koropets.imperva.dto.VendorMachine;
import com.koropets.imperva.entity.VendorMachineEntity;

public class VendorMachineMapper extends Mapper<VendorMachineEntity, VendorMachine> {
    @Override
    protected VendorMachine asDto(VendorMachineEntity vendorMachineEntity) {
        return null;
    }

    @Override
    protected VendorMachineEntity asEntity(VendorMachine vendorMachine) {
        return null;
    }
}
