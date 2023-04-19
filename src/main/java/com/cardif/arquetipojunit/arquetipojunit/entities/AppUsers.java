package com.cardif.arquetipojunit.arquetipojunit.entities;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class AppUsers {

    @Id
    @GeneratedValue
    private long id;

    private String Nombre;
    private long Age;

    public AppUsers(long id, String nombre, long age) {
        this.id = id;
        Nombre = nombre;
        Age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public long getAge() {
        return Age;
    }

    public void setAge(long age) {
        Age = age;
    }

    // standard constructor, getters, setters
}