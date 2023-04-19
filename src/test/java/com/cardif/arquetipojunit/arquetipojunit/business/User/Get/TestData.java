package com.cardif.arquetipojunit.arquetipojunit.business.User.Get;

import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;

import java.util.Arrays;
import java.util.List;

public class TestData {
    static List<AppUserDto> Users = Arrays.asList(
            new AppUserDto("Benito Martinez", 29),
            new AppUserDto("Ramon Ayala", 46),
            new AppUserDto("Pablo Acevedo", 23)
    );
}
