package com.cardif.arquetipojunit.arquetipojunit.business.User.Get;

import com.cardif.arquetipojunit.arquetipojunit.dtos.UserDto;

import java.util.Arrays;
import java.util.List;

public class TestData {
    static List<UserDto> Users = Arrays.asList(
            new UserDto("Benito Martinez", 29),
            new UserDto("Ramon Ayala", 46),
            new UserDto("Pablo Acevedo", 23)
    );
}
