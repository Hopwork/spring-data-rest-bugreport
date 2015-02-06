package com.hopwork.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.rest.core.annotation.RestResource;

import java.io.Serializable;
import java.util.List;

@NoRepositoryBean
public interface ReadOnlyRepository<T, ID extends Serializable> extends MongoRepository <T, ID> {

    @RestResource(exported = false)
    Iterable<T> findAll(Iterable<ID> strings);

    @RestResource(exported = false)
    List<T> findAll();

    @RestResource(exported = false)
    List<T> findAll(Sort sort);

    @RestResource(exported = false)
    Page<T> findAll(Pageable pageable);

    @Override
    @RestResource(exported = false)
    <S extends T> List<S> save(Iterable<S> entites);

    @Override
    @RestResource(exported = false)
    <S extends T> S save(S s);

    @Override
    @RestResource(exported = false)
    void delete(ID id);

    @Override
    @RestResource(exported = false)
    void delete(T t);

    @Override
    @RestResource(exported = false)
    void delete(Iterable<? extends T> ts);

    @Override
    @RestResource(exported = false)
    void deleteAll();

}
