package com.cardif.arquetipojunit.arquetipojunit.business;

import com.cardif.arquetipojunit.arquetipojunit.dao.AppUserDao;
import com.cardif.arquetipojunit.arquetipojunit.dtos.UserDto;
import com.cardif.arquetipojunit.arquetipojunit.entities.AppUsers;
import com.cardif.arquetipojunit.arquetipojunit.ibusiness.UserBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBusinessImpls implements UserBusiness {


    @Autowired
    AppUserDao appUserDao;

    @Override
    public List<UserDto> Get()
    {
        AppUsers t = appUserDao.getOne(1l);

        return appUserDao.Users;

    }
}
