package com.example.glossaryofindustry.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.glossaryofindustry.container.searchcondition.UsersSearchCondition;
import com.example.glossaryofindustry.domains.Users;

@Mapper
public interface UsersMapper {

    List<Users> all();

    /**
     * ユーザー登録を行う
     * 
     * @param userName
     * @param pasword
     */
    void createUser(String userName, String pasword);

    /**
     * 検索条件を基にユーザー情報を取得する
     * 
     * @param searchCondition
     * @return userList
     */
    List<Users> findBySearchCondition(@Param("searchCondition") UsersSearchCondition searchCondition);
}
