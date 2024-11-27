package com.example.dao;

import java.util.List;

public interface IDao<T> {

    List<T> findAll();
    T findById(int id);
    void add(T obj);
    void update(T obj);
    void delete(int id);

}
