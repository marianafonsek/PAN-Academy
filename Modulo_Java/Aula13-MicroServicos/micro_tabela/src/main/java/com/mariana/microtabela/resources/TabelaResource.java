package com.mariana.microtabela.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mariana.microtabela.model.Tabela;
import com.mariana.microtabela.repositories.TabelaRepository;

@RestController
@RequestMapping(value = "/tabela")
public class TabelaResource {

    @Autowired
    private TabelaRepository repository;

    @GetMapping
    public ResponseEntity<List<Tabela>> findAll() {
        List<Tabela> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tabela> findById(@PathVariable Long id) {
        Tabela obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

}