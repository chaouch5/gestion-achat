package com.example.gestion_achat.Services.Stock;

import com.example.gestion_achat.Repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class genericServiceIpml<T,ID> implements genericService<T,ID> {


    @Autowired
    public GenericRepository<T,ID> genericRepository ;


    @Override
    public List<T> retrieveAll() {
        return  genericRepository.findAll();
    }

    @Override
    public T add(T t) {
      return   genericRepository.save(t);
    }

    @Override
    public T update(T t) {
        System.out.println("update");
      return   genericRepository.save(t);

    }

    @Override
    public void delete(ID id) {
        genericRepository.deleteById(id);

    }

   @Override
    public T findById(ID id) {
       return genericRepository.findById(id).orElse(null);
    }

}
