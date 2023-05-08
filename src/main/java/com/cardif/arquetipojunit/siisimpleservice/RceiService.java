package com.cardif.arquetipojunit.siisimpleservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
/**
 * Interfaz de un servicio de Registro Civil e Identificación.
 */
public interface RceiService {
    /**
     * Método que entrega la lista de ruts con arraigo nacional.
     * @return
     */
    List<SiiResponseDto> GetRutsArraigo();
}
