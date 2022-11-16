package com.example.gestion_achat.Controllers;


import com.example.gestion_achat.Services.Stock.StockServiceImpl;
import com.example.gestion_achat.entity.stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/stock")

public class stockController {
    @Autowired
   StockServiceImpl stockServiceImpl ;

    @GetMapping
    public List<stock> getAll() {

        return stockServiceImpl.retrieveAllStocks();

    }

    @PostMapping
    public stock addStock(@RequestBody stock s) {
        return stockServiceImpl.addStock(s);

    }

    @PutMapping
    public stock updateStock(@RequestBody stock s) {
        return stockServiceImpl.updateStock(s);

    }

    @DeleteMapping("/{id}")
    public void deleteStock(@PathVariable(value ="id")long id) {
        stockServiceImpl.removeStock(id);
    }

    @GetMapping("/{id}")
    public stock getStockByID(@PathVariable(value ="id")long id) {
        return stockServiceImpl.retrieveStock(id);
    }

}
