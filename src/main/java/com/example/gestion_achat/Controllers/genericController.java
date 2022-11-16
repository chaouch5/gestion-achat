package com.example.gestion_achat.Controllers;

import com.example.gestion_achat.Services.Stock.genericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class genericController<T,ID> {
    @Autowired
    genericService<T,ID> genericService;

    @GetMapping()
    public List<T> getAll(){

        return genericService.retrieveAll();

    }


    @PostMapping("/add")
    public ResponseEntity<T> add(@RequestBody T e){

        return ResponseEntity.ok(this.genericService.add(e));


    }

    // @PutMapping(path ="{id}")
    @PutMapping("/update/{id}")
    public ResponseEntity<T>update(@RequestBody T e){

        return ResponseEntity.ok(this.genericService.update(e));


    }



    @GetMapping("/{id}")
    public T retrieveById(@PathVariable("id") ID id) {

        return this.genericService.findById(id);

    }


    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable("id") ID id) {

        this.genericService.delete(id);

    }

}
