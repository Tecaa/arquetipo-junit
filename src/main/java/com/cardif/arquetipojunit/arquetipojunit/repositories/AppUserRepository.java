package com.cardif.arquetipojunit.arquetipojunit.repositories;

import com.cardif.arquetipojunit.arquetipojunit.entities.AppUsers;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


/**
 * Interfaz tipo JpaRepository para la entidad AppUsers
 */
public interface AppUserRepository extends JpaRepository<AppUsers, Long> {

}