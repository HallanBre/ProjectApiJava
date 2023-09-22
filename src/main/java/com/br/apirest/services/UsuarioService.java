package com.br.apirest.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.apirest.entities.Usuario;
import com.br.apirest.repository.UsuarioRepository;

@Service //porq e uma classe de servico
public class UsuarioService {
    
    @Autowired
    UsuarioRepository repository;
    public List<Usuario> listaUsuario(){
    List<Usuario> usuarios = new ArrayList<>();
    usuarios = repository.findAll();
    return usuarios;
        
    }
    
}
