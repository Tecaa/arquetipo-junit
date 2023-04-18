package com.cardif.arquetipojunit.arquetipojunit.controllers;

import com.cardif.arquetipojunit.arquetipojunit.business.UserBusinessImpls;
import com.cardif.arquetipojunit.arquetipojunit.dtos.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private UserBusinessImpls userBusiness;

    @RequestMapping("/aa")
    public String helloWorld(){
        List<UserDto> dtos = userBusiness.Get();
        return dtos.get(0).Name + dtos.get(0).Age;
    }
}