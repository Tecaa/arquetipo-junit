package com.cardif.arquetipojunit.arquetipojunit.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private long id;

    private String Nombre;
    private long Age;

    // standard constructor, getters, setters
}