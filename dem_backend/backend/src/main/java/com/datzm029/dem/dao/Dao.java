package com.datzm029.dem.dao;

import java.util.List;

public interface Dao<T> {
    T insert(T t);

    List<T> selectAll();

    T checkIfExist(T object);

}
