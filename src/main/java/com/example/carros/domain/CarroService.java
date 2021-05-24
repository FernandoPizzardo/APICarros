package com.example.carros.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository repository;

    public Iterable<Carro> getCarros() {

        return repository.findAll();


    }

    public Optional<Carro> getCarrosByID(Long id) {
        return repository.findById(id);
    }


    public Iterable<Carro> getCarrosByTipo(String tipo) {
        return repository.findByTipo(tipo);
    }

    public String save(Carro carro) {
        Carro c = repository.save(carro);
        return "Carro com salvo com suceso" + c.getId();
    }
}
