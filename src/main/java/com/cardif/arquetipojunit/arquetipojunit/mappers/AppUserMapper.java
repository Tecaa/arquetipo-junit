package com.cardif.arquetipojunit.arquetipojunit.mappers;

import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.arquetipojunit.entities.AppUsers;
import org.springframework.stereotype.Service;

@Service
public class AppUserMapper {
    public AppUserDto toDto(AppUsers appUser){
        return new AppUserDto(appUser.getName(), appUser.getAge());
    }
}
