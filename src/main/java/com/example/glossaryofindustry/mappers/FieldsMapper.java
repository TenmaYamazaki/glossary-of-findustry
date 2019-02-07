package com.example.glossaryofindustry.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.glossaryofindustry.domains.Fields;

@Mapper
public interface FieldsMapper {

    List<Fields> all();
}
