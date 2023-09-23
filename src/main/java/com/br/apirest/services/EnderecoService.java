package com.br.apirest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.apirest.entities.Endereco;
import com.br.apirest.repository.EnderecoRepository;




@Service
public class EnderecoService {
    

    @Autowired
    EnderecoRepository repository;


    //listar
    public List<Endereco> listaEndereco(){

        List<Endereco> enderecos = new ArrayList<>();
        enderecos = repository.findAll();
        return enderecos;

    }
    //CADASTRAR
    public String cadastroEndereco(Endereco endereco){
        repository.save(endereco);
        return "";
    }
    //BUSCAR POR ID
    public Endereco BuscarID(int id){
        Endereco endereco = new Endereco();
        endereco = repository.findById(id);
        return endereco; 
    }

    //EXCLUIR POR ID
    public String excluirID(int id){
        repository.deleteById(id);
        return "";
    }
}
