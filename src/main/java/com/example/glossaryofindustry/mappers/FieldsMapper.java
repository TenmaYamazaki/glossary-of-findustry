package com.example.glossaryofindustry.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.thymeleaf.spring5.expression.Fields;

@Mapper
public interface FieldsMapper {

    List<Fields> all();
}
