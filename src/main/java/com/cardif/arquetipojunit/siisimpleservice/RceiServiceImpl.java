package com.cardif.arquetipojunit.siisimpleservice;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
/**
 * Implementación del servicio Rcei. Simular hacer una llamada REST.
 * No realiza realmente una llamada REST,
 * solo accede a datos en memoria hard-coded. Aún así es un buen ejemplo.
 */
public class RceiServiceImpl implements RceiService {

    /**
     * Datos en duro. Simulan ser los datos que vienen de una llamada de API REST.
     */
    private List<SiiResponseDto> RutsArraigo = Arrays.asList(
            new SiiResponseDto(100, "18000000-0"),
            new SiiResponseDto(300, "19000000-0"));

    /**
     * Simula ser un método que llama a una API REST y obtiene una lista de datos.
     * @return
     */
    public List<SiiResponseDto> GetRutsArraigo(){
        // Supuestamente, en este punto se hace llamada REST y se obtienen los datos a responder.
        // En su lugar, se entregan los datos hard-codeados por simplicidad.
        return RutsArraigo;
    }
}
