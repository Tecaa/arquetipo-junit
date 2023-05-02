package com.cardif.arquetipojunit.arquetipojunit.business;

import com.cardif.arquetipojunit.arquetipojunit.dao.AppUserDao;
import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.arquetipojunit.entities.AppUsers;
import com.cardif.arquetipojunit.arquetipojunit.ibusiness.UserBusiness;
import com.cardif.arquetipojunit.arquetipojunit.mappers.AppUserMapper;
import com.cardif.arquetipojunit.siisimpleservice.SiiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBusinessImpls implements UserBusiness {


    @Autowired
    SiiService siiService;

    @Autowired
    AppUserDao appUserDao;

    @Autowired
    AppUserMapper appUserMapper;

    @Override
    public List<AppUserDto> get()
    {
        List<AppUsers> users = appUserDao.findAll();
        List<AppUserDto> usersDto = new ArrayList<>();
        users.forEach(user ->{
            usersDto.add(appUserMapper.toDto(user));
        } );
        return usersDto;
    }

    @Override
    public List<String> getArraigo() {
        return siiService.GetRutsArraigo();
    }
}
