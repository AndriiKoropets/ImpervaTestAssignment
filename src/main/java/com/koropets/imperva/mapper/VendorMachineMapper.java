package com.koropets.imperva.mapper;

import com.koropets.imperva.dto.VendorMachine;
import com.koropets.imperva.entity.VendorMachineEntity;
import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class VendorMachineMapper extends Mapper<VendorMachineEntity, VendorMachine> {

    private final BeverageMapper beverageMapper;

    @Override
    protected VendorMachine asDto(VendorMachineEntity e) {
        return VendorMachine.builder()
                .uuid(e.getUuid())
                .location(e.getLocation())
                .beverages(beverageMapper.toDto(e.getBeverages()))
                .build();
    }

    @Override
    protected VendorMachineEntity asEntity(VendorMachine dto) {
        return VendorMachineEntity.builder()
                .uuid(dto.getUuid() == null ? UUID.randomUUID().toString() : dto.getUuid())
                .location(dto.getLocation())
                .beverages(beverageMapper.toEntity(dto.getBeverages()))
                .build();
    }
}
