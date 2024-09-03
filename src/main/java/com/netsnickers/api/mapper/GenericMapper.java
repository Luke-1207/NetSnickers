package com.netsnickers.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface GenericMapper {

    GenericMapper INSTANCE = Mappers.getMapper(GenericMapper.class);

    <E, D> D toDTO(E entity, Class<D> dtoClass);
    <D, E> E toEntity(D dto, Class<E> entityClass);

    <E, D> List<D> toDTOList(List<E> entityList, Class<D> dtoClass);
    <D, E> List<E> toEntityList(List<D> dtoList, Class<E> entityClass);
}