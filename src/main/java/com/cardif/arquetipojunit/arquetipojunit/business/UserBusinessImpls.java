package com.cardif.arquetipojunit.arquetipojunit.business;

import com.cardif.arquetipojunit.arquetipojunit.dao.UserDao;
import com.cardif.arquetipojunit.arquetipojunit.dtos.UserDto;
import com.cardif.arquetipojunit.arquetipojunit.ibusiness.UserBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBusinessImpls implements UserBusiness {


    @Autowired
    UserDao userDao;

    @Override
    public List<UserDto> Get() {
        return userDao.Users;
    }
}
