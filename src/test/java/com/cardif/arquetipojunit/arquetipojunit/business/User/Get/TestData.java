package com.cardif.arquetipojunit.arquetipojunit.business.User.Get;

import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.arquetipojunit.entities.AppUsers;

import java.util.Arrays;
import java.util.List;

public class TestData {
    static List<AppUsers> Users = Arrays.asList(
            new AppUsers(1, "Benito Martinez", 29),
            new AppUsers(2, "Ramon Ayala", 46),
            new AppUsers(3, "Pablo Acevedo", 23)
    );
}
