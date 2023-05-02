package com.cardif.arquetipojunit.arquetipojunit.business.User;

import com.cardif.arquetipojunit.arquetipojunit.entities.AppUsers;

import java.util.Arrays;
import java.util.List;

public class GetData {
    static List<AppUsers> Users = Arrays.asList(
            new AppUsers(1, "Benito Martinez", 29, "17000000-0"),
            new AppUsers(2, "Ramon Ayala", 46, "18000000-0"),
            new AppUsers(3, "Pablo Acevedo", 23, "19000000-0")
    );
}
