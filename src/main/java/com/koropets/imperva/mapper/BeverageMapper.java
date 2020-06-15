package com.koropets.imperva.mapper;

import com.koropets.imperva.dto.Beverage;
import com.koropets.imperva.entity.BeverageEntity;

public class BeverageMapper extends Mapper<BeverageEntity, Beverage> {
    @Override
    protected Beverage asDto(BeverageEntity e) {
        return Beverage.builder()
                .name(e.getName())
                .address(e.getAddress())
                .consist(e.getConsists())
                .build();
    }

    @Override
    protected BeverageEntity asEntity(Beverage dto) {
        return BeverageEntity.builder()
                .id(dto.getId())
                .name(dto.getName())
                .address(dto.getAddress())
                .consists(dto.getConsist())
                .build();
    }
}
