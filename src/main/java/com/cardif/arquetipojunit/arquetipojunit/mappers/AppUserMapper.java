package com.cardif.arquetipojunit.arquetipojunit.mappers;

import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.arquetipojunit.entities.AppUsers;
import org.springframework.stereotype.Service;

@Service
/**
 * Servicio que permite mapear entidades AppUser y sus Dtos
 */
public class AppUserMapper {
    public AppUserDto toDto(AppUsers appUser){
        return new AppUserDto(appUser.getName(), appUser.getAge(), appUser.getId());
    }
}
