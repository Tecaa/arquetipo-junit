package com.cardif.arquetipojunit.arquetipojunit.dao;

import com.cardif.arquetipojunit.arquetipojunit.dtos.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserDao {
    public List<UserDto> Users = Arrays.asList(new UserDto("Aaaa", 12));
}
