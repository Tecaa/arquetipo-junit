package com.cardif.arquetipojunit.arquetipojunit.controllers;

import com.cardif.arquetipojunit.arquetipojunit.business.UserBusinessImpls;
import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import com.cardif.arquetipojunit.arquetipojunit.ibusiness.UserBusiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
/**
 * Controlador de ejemplo. Contiene dos servicios. Uno que se
 * conecta a una base de datos y uno que se conecta a una API REST Simulada.
 */
public class UserController {

    @Autowired
    /**
     * Capa de negocio del controlador.
     */
    private UserBusiness userBusiness;

    @RequestMapping("/")
    /**
     * Método que retorna el listado de usuarios en base de datos.
     */
    public List<AppUserDto> get(){
        return userBusiness.get();
    }

    @RequestMapping("/arraigo")
    /**
     * Método que retorna el listado de ruts con arraigo desde el servicio rest simulado.
     */
    public List<String> getArraigo(){
        return userBusiness.getArraigo();
    }
}