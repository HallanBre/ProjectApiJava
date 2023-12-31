package com.br.apirest.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.apirest.entities.Endereco;
import com.br.apirest.repository.EnderecoRepository;
import com.br.apirest.services.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

    @Autowired
    EnderecoRepository eRepository;

    @Autowired
    EnderecoService service;

    //listar
    @GetMapping("/lista")
    public List<Endereco> getObject(){
        return service.listaEndereco();
    }

    @PostMapping("/cadastro")
    public String endereco(Endereco endereco){
        return service.cadastroEndereco(endereco);
    }

    @GetMapping("/busca/{id}")
    public Endereco getObjectId(@PathVariable("id") int id){
        return service.BuscarID(id);
    }

    @GetMapping("/excluir/{id}")
    public String DeletId(@PathVariable("id") int id){
        return service.excluirID(id);
    }

    
    
}
