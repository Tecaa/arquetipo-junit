package com.cardif.arquetipojunit.arquetipojunit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class AppUsers {

    @Id
    @GeneratedValue
    private long id;

    private String Name;
    private long Age;


    public AppUsers(long id, String name, long age) {
        this.id = id;
        Name = name;
        Age = age;
    }

    public AppUsers() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getAge() {
        return Age;
    }

    public void setAge(long age) {
        Age = age;
    }

    // standard constructor, getters, setters
}