package com.cardif.arquetipojunit.arquetipojunit.controllers;

import com.cardif.arquetipojunit.arquetipojunit.business.UserBusinessImpls;
import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.arquetipojunit.ibusiness.UserBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserBusiness userBusiness;

    @RequestMapping("/")
    public List<AppUserDto> get(){
        return userBusiness.get();
    }

    @RequestMapping("/arraigo")
    public List<String> getArraigo(){
        return userBusiness.getArraigo();
    }
}