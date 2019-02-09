package com.example.glossaryofindustry.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.glossaryofindustry.container.searchcondition.UsersSearchCondition;
import com.example.glossaryofindustry.domains.Users;
import com.example.glossaryofindustry.mappers.UsersMapper;
import com.example.glossaryofindustry.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UsersMapper usersMapper;

    @Override
    public void createUser(String userName, String pasword) {
        usersMapper.createUser(userName, pasword);
    }

    @Override
    public List<Users> findBySearchCondition(UsersSearchCondition searchCondition) {
        List<Users> result = usersMapper.findBySearchCondition(searchCondition);
        return result;
    }

}
