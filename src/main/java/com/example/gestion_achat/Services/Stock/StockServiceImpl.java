package com.example.gestion_achat.Services.Stock;


import com.example.gestion_achat.Repository.StockRepository;
import com.example.gestion_achat.entity.stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements  stockService{


    @Autowired
    public StockRepository stockRepository;


    @Override
    public List<stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public stock addStock(stock s) {
        return stockRepository.save(s);
    }

    @Override
    public stock updateStock(stock s) {
       return stockRepository.save(s);
    }

    @Override
    public stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null)    ;
    }

    @Override
    public void removeStock(Long id) {
        this.stockRepository.deleteById(id);
    }
}

