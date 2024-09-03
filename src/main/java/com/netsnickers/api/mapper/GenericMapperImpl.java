package com.netsnickers.api.mapper;

import org.springframework.stereotype.Component;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GenericMapperImpl {

    private final GenericMapper mapper = Mappers.getMapper(GenericMapper.class);

    public <E, D> D toDTO(E entity, Class<D> dtoClass) {
        return mapper.toDTO(entity, dtoClass);
    }

    public <D, E> E toEntity(D dto, Class<E> entityClass) {
        return mapper.toEntity(dto, entityClass);
    }

    public <E, D> List<D> toDTOList(List<E> entityList, Class<D> dtoClass) {
        return entityList.stream()
                .map(entity -> mapper.toDTO(entity, dtoClass))
                .collect(Collectors.toList());
    }

    public <D, E> List<E> toEntityList(List<D> dtoList, Class<E> entityClass) {
        return dtoList.stream()
                .map(dto -> mapper.toEntity(dto, entityClass))
                .collect(Collectors.toList());
    }
}
