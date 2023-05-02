package com.cardif.arquetipojunit.arquetipojunit.ibusiness;

import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserBusiness {
    List<AppUserDto> get();
    List<String> getArraigo();
}
