package com.br.apirest.api.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.apirest.entities.Pedido;
import com.br.apirest.repository.PedidoRepository;

@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {

    @Autowired
    PedidoRepository pRepository;

    @GetMapping("/lista")
    public List<Pedido> getObject(){

        List<Pedido> pedidos = new ArrayList<>();
        pedidos = (List<Pedido>) pRepository.findAll();
        

        return pedidos; 
    }
   

    @PostMapping("/cadastro") // receber informações do cadastro de pedidos
    public Pedido cadastro(Pedido pedido){
        pRepository.save(pedido);
        return pedido;
    }

}