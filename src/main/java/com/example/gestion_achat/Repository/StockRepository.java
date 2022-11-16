package com.example.gestion_achat.Repository;

import com.example.gestion_achat.entity.stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<stock,Long> {
}
