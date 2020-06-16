package com.koropets.imperva.mapper;

import com.koropets.imperva.dto.Beverage;
import com.koropets.imperva.entity.BeverageEntity;

public class BeverageMapper extends Mapper<BeverageEntity, Beverage> {
    @Override
    protected Beverage asDto(BeverageEntity e) {
        return Beverage.builder()
                .name(e.getName())
                .address(e.getAddress())
                .consist(e.getConsist())
                .price(e.getPrice())
                .codeBarres(e.getCodeBarres())
                .build();
    }

    @Override
    protected BeverageEntity asEntity(Beverage dto) {
        return BeverageEntity.builder()
                .id(dto.getId())
                .name(dto.getName())
                .address(dto.getAddress())
                .consist(dto.getConsist())
                .price(dto.getPrice())
                .codeBarres(dto.getCodeBarres())
                .build();
    }
}
