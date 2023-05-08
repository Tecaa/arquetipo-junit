package com.cardif.arquetipojunit.arquetipojunit.business;

import com.cardif.arquetipojunit.arquetipojunit.dao.AppUserDao;
import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.arquetipojunit.entities.AppUsers;
import com.cardif.arquetipojunit.arquetipojunit.ibusiness.UserBusiness;
import com.cardif.arquetipojunit.arquetipojunit.mappers.AppUserMapper;
import com.cardif.arquetipojunit.siisimpleservice.RceiService;
import com.cardif.arquetipojunit.siisimpleservice.SiiResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
/**
 * Implementación de la capa de negocio de User.
 */
public class UserBusinessImpls implements UserBusiness {


    @Autowired
    /**
     * Inyección del servicio de Rcei (Registro Civil e Identificación).
     */
    RceiService rceiService;

    @Autowired
    /**
     * Inyección de la capa de acceso a datos (DAO) de un AppUser.
     */
    AppUserDao appUserDao;

    @Autowired
    /**
     * Inyección de un servicio Mapper que nos permite mapear entidades a Dtos.
     */
    AppUserMapper appUserMapper;

    @Override
    /**
     * Implementación que nos permite obtener el listado de usuarios de la BD.
     */
    public List<AppUserDto> get()
    {
        // Se obtienen todos los usuarios de la BD
        List<AppUsers> users = appUserDao.findAll();

        // Se crea una lista vacía de Dtos.
        List<AppUserDto> usersDto = new ArrayList<>();

        // Por cada usuario de la BD, éstos se mapean a un DTO y se añaden a la lista.
        users.forEach(user ->{
            usersDto.add(appUserMapper.toDto(user));
        } );
        return usersDto;
    }

    @Override
    public List<String> getArraigo() {
        // Se obtiene stream de lista
        Stream<SiiResponseDto> stream = rceiService.GetRutsArraigo().stream();
        // Se entrega solo una lista de ruts.
        return stream.map(x -> x.getRut()).collect(Collectors.toList());
    }
}
