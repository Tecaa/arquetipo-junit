package com.cardif.arquetipojunit.siisimpleservice;

/**
 * Clase que encapsula los datos enviados desde la API Rest RCeI
 */
public class SiiResponseDto {
    private int Id;
    private String Rut;

    public SiiResponseDto(int id, String rut) {
        Id = id;
        Rut = rut;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String rut) {
        Rut = rut;
    }
}
