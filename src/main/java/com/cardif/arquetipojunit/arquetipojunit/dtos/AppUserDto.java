package com.cardif.arquetipojunit.arquetipojunit.dtos;

public class AppUserDto {
    public String Name;
    public long Age;

    public long Id;

    public AppUserDto(String name, long age, long id) {
        Name = name;
        Age = age;
        Id = id;
    }
}
