package com.br.apirest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.apirest.entities.Pagamento;
import com.br.apirest.services.PagamentoService;

@RestController
@RequestMapping(value = "/pedido")
public class PagamentoController {

    @Autowired
    PagamentoService service;

    @GetMapping("/lista")
    public List<Pagamento>getObject(){
        return service.listaPagamento();
    }
    @PostMapping("/cadastro")
    public String cadastro(Pagamento pagamento){
        return service.cadastroPagamento(pagamento);
    }
    @GetMapping("/busca/{id}")
    public Pagamento getObjectID(@PathVariable("id") int id){
        return service.BuscarID(id);
    }
    @GetMapping("/excluir/{id}")
    public String DeleteId(@PathVariable("id") int id){
        return service.excluirID(id);
    }
    
}
