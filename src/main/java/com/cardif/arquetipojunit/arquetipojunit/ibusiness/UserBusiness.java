package com.cardif.arquetipojunit.arquetipojunit.ibusiness;

import com.cardif.arquetipojunit.arquetipojunit.dtos.AppUserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/**
 * Interfaz de la capa de negocio de User.
 */
public interface UserBusiness {

    /**
     * Método que entrega la lista de usuarios de la base de datos.
     * @return
     */
    List<AppUserDto> get();

    /**
     * Método que entrega la lista de ruts con arraigo desde la API Simulada.
     * @return
     */
    List<String> getArraigo();
}
