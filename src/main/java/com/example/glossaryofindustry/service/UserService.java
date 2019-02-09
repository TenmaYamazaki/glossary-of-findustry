package com.example.glossaryofindustry.service;

import java.util.List;

import com.example.glossaryofindustry.container.searchcondition.UsersSearchCondition;
import com.example.glossaryofindustry.domains.Users;

public interface UserService {

    /**
     * ユーザー登録を行う
     * 
     * @param userName
     * @param pasword
     */
    public void createUser(String userName, String pasword);

    /**
     * 検索条件を元にユーザー情報を取得する
     * 
     * @param searchCondition
     * @return userList
     */
    public List<Users> findBySearchCondition(UsersSearchCondition searchCondition);
}
