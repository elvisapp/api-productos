package com.example.productos_api.repository;

import com.example.productos_api.model.Agricola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgricolaRepository extends JpaRepository<Agricola, Long> {
}
