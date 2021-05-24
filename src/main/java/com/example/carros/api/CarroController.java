package com.example.carros.api;


import com.example.carros.domain.Carro;
import com.example.carros.domain.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/controller")
public class CarroController {
   @Autowired
   private CarroService service;

    @GetMapping
    public Iterable<Carro> get(){
        return service.getCarros();
    }
    @GetMapping("/{id}")
    public Optional<Carro> get(@PathVariable("id") Long id){
        return service.getCarrosByID(id);
    }
    @GetMapping("/tipo/{tipo}")
    public Iterable<Carro> getTipos(@PathVariable("tipo")String tipo){
        return service.getCarrosByTipo(tipo);
    }
    @PostMapping
    public String post(@RequestBody Carro carro){
       return service.save(carro);
    }
}
