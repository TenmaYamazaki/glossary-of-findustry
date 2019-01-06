package com.example.glossaryofindustry.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.glossaryofindustry.domains.Users;

@Mapper
public interface UsersMapper {

    List<Users> all();
}
