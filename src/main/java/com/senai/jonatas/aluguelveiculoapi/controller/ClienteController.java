package com.senai.jonatas.aluguelveiculoapi.controller;

import com.senai.jonatas.aluguelveiculoapi.entity.Cliente;
import com.senai.jonatas.aluguelveiculoapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin("*")
public class ClienteController {
    @Autowired
    private ClienteService repo;

    @PostMapping
    public Cliente salvar(@RequestBody Cliente c) {
        return repo.salvar(c);
    }

    @GetMapping
    public List<Cliente> listar() {
        return repo.listarTodos();
    }
}
