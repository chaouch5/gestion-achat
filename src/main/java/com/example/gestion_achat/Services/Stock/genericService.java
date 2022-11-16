package com.example.gestion_achat.Services.Stock;

import java.util.List;

public interface genericService<T,ID> {


    List<T> retrieveAll();
    T add(T t);
    T update(T t);
    void delete(ID id);
    T findById(ID id);
}
