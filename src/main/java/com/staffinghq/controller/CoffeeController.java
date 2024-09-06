package com.staffinghq.controller;

import com.staffinghq.entity.Coffee;
import com.staffinghq.service.CoffeeService;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/coffees")
public class CoffeeController {
    private final CoffeeService coffeeService;

    public CoffeeController(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Coffee>> getAll() {
        return ResponseEntity.ok(this.coffeeService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coffee> getById(@PathVariable Long id) {
        return ResponseEntity.ok(this.coffeeService.getById(id));
    }
}