package com.example.glossaryofindustry.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.glossaryofindustry.domains.Glossarys;

@Mapper
public interface GlossarysMapper {

    List<Glossarys> all();
}
