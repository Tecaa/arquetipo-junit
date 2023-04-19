package com.cardif.arquetipojunit.arquetipojunit.dao;

import com.cardif.arquetipojunit.arquetipojunit.dtos.UserDto;
import com.cardif.arquetipojunit.arquetipojunit.entities.AppUsers;
import com.cardif.arquetipojunit.arquetipojunit.repositories.AppUserRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class AppUserDao implements AppUserRepository {
    public List<UserDto> Users = Arrays.asList(new UserDto("Aaaa", 12));
    @PersistenceContext
    private EntityManager em;
    /*public AppUserDao(EntityManager em) {
        this.em = em;
    }*/

    @Override
    public List<AppUsers> findAll() {
        return null;
    }

    @Override
    public List<AppUsers> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<AppUsers> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<AppUsers> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(AppUsers entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends AppUsers> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends AppUsers> S save(S entity) {
        return null;
    }

    @Override
    public <S extends AppUsers> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<AppUsers> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends AppUsers> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<AppUsers> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public AppUsers getOne(Long aLong) {
        AppUsers e = this.em.find(AppUsers.class, aLong);
        return e;
    }

    @Override
    public <S extends AppUsers> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends AppUsers> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends AppUsers> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends AppUsers> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AppUsers> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends AppUsers> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends AppUsers, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
