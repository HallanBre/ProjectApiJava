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

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

    @Autowired
    EnderecoRepository eRepository;


    //listar
    @GetMapping("/lista")
    public List<Endereco> getObject(){
        List<Endereco> enderecos = new ArrayList<>();
        enderecos = (List<Endereco>) eRepository.findAll();

        return enderecos;
    }

    @PostMapping("/cadastro")
    public Endereco endereco(Endereco endereco){
        eRepository.save(endereco);
        return endereco;
    }

    
    
}
