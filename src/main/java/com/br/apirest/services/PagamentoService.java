package com.br.apirest.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.apirest.entities.Endereco;
import com.br.apirest.entities.Pagamento;
import com.br.apirest.repository.PagamentoRepository;

@Service
public class PagamentoService {
    
    @Autowired
    PagamentoRepository repository;

    //listar
    public List<Pagamento> listaPagamento(){
        
        List<Pagamento> pagamentos = new ArrayList<>();
        pagamentos = repository.findAll();
        return pagamentos;
    }

    public String cadastroPagamento(Pagamento pagamento){
        repository.save(pagamento);
        return "";
    }

    public Pagamento BuscarID(int id){
        Pagamento pagamento = new Pagamento();
        pagamento = repository.findById(id);
        return pagamento;
    }

    public String excluirID(int id){
        repository.deleteById(id);
        return "";
    }
    
}
