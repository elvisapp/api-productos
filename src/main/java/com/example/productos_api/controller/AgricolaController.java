package com.example.productos_api.controller;

import com.example.productos_api.model.Agricola;
import com.example.productos_api.repository.AgricolaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5000") // Ajusta con tu configuración
@RestController
@RequestMapping("/api/agricolas")
public class AgricolaController {

    @Autowired
    private AgricolaRepository agricolaRepository;

    @GetMapping
    public List<Agricola> getAgricolas() {
        return agricolaRepository.findAll();
    }
}
