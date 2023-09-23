package com.br.apirest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.apirest.entities.Pedido;
import com.br.apirest.repository.PedidoRepository;

@Service
public class PedidoService {
    

    @Autowired
    PedidoRepository repository;


    //listar
    public List<Pedido> listaPedido(){

        List<Pedido> pedidos = new ArrayList<>();
        pedidos = repository.findAll();
        return pedidos;

    }
    //CADASTRAR
    public String cadastroPedido(Pedido pedido){
        repository.save(pedido);
        return "";
    }
    public Pedido BuscarID(int id){
        Pedido pedidos = new Pedido();
        pedidos = repository.findById(id);
        return pedidos; 
    }
    public String excluirID(int id){
        
        repository.deleteById(id);
        return "";
    }
}
