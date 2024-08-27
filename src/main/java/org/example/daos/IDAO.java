package org.example.daos;

import org.example.entities.User;

import java.util.Set;

public interface IDAO<T> {
    T getById(Integer id);
    Set<T> getAll();
    void create(T t);

}
