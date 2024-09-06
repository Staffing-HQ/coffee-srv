package com.staffinghq.service;

import com.staffinghq.entity.Coffee;
import com.staffinghq.repository.CoffeeRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeService {
    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public List<Coffee> getAll() {
        return this.coffeeRepository.findAll();
    }

    public Coffee getById(Long id) {
        return this.coffeeRepository.findById(id).orElse(null);
    }
}