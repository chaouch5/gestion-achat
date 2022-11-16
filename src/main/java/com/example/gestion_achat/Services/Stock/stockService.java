package com.example.gestion_achat.Services.Stock;

import com.example.gestion_achat.entity.stock;

import java.util.List;

public interface stockService {

    List<stock> retrieveAllStocks();
    stock addStock(stock s);
    stock updateStock(stock s);
    stock retrieveStock(Long id);
    void removeStock(Long id);
}
