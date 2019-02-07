package com.example.glossaryofindustry.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.glossaryofindustry.domains.FieldsChildren;

@Mapper
public interface FieldsChildrenMapper {

    List<FieldsChildren> all();
}
