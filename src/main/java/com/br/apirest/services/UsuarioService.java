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

    //LISTAR
    public List<Usuario> listaUsuario(){
    List<Usuario> usuarios = new ArrayList<>();
    usuarios = repository.findAll();
    return usuarios;
        
    }

    public String salvar(Usuario usuario){
        repository.save(usuario);
        return "";
    }

    public Usuario buscaID(int id){

        Usuario usuario = new Usuario();
        usuario = repository.findById(id);
        return usuario;

    }

    public String excluirID(int id){
        Usuario usuario = new Usuario();
        repository.deleteById(id);
        return "";
    }

    
}
