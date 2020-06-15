package com.koropets.imperva.mapper;

import com.koropets.imperva.dto.VendorMachine;
import com.koropets.imperva.entity.VendorMachineEntity;

public class VendorMachineMapper extends Mapper<VendorMachineEntity, VendorMachine> {
    @Override
    protected VendorMachine asDto(VendorMachineEntity e) {
        return VendorMachine.builder()
                .uuid(e.getUuid())
                .location(e.getLocation())
                .build();
    }

    @Override
    protected VendorMachineEntity asEntity(VendorMachine dto) {
        return VendorMachineEntity.builder()
                .id(dto.getId())
                .uuid(dto.getUuid())
                .location(dto.getLocation())
                .build();
    }
}
