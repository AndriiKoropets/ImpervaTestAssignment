package com.koropets.imperva.mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public abstract class Mapper<Entity, Dto> {

    public Dto toDto(Entity entity) {
        return Optional.ofNullable(entity)
                .map(this::asDto)
                .orElseThrow(() -> new IllegalArgumentException("Got null entity"));
    }

    public Entity toEntity(Dto dto) {
        return Optional.ofNullable(dto)
                .map(this::asEntity)
                .orElseThrow(() -> new IllegalArgumentException("Got null dto"));
    }

    protected abstract Dto asDto(Entity entity);

    protected abstract Entity asEntity(Dto dto);

    public List<Dto> toDto(List<Entity> entityList) {
        return toDto(entityList, entityList == null ? new ArrayList<>() : new ArrayList<>(entityList.size()));
    }

    public List<Entity> toEntity(List<Dto> dtoList) {
        return toEntity(dtoList, dtoList == null ? new ArrayList<>() : new ArrayList<>(dtoList.size()));
    }

    private <C extends Collection<Dto>> C toDto(Collection<Entity> entityList, C result) {
        Optional.ofNullable(entityList)
                .orElseGet(ArrayList::new)
                .stream()
                .map(this::toDto)
                .forEach(result::add);

        return result;
    }

    private <C extends Collection<Entity>> C toEntity(Collection<Dto> dtoList, C result) {
        Optional.ofNullable(dtoList)
                .orElseGet(ArrayList::new)
                .stream()
                .map(this::toEntity)
                .forEach(result::add);

        return result;
    }
}