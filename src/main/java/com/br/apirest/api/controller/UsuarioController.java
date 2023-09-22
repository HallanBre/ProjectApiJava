package com.br.apirest.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.apirest.entities.Usuario;
import com.br.apirest.repository.UsuarioRepository;
import com.br.apirest.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository uRepository;

    @Autowired
    UsuarioService service;



    @GetMapping("/lista")//listar todos o usuarios dentro do Bd
    public List<Usuario> ListaUsuarios(){
        return service.listaUsuario(); 
    }

    
    @PostMapping("/cadastro") // receber informações do cadastro de usuarios
    public String cadastro(Usuario usuario){
        return service.salvar(usuario);
    }


    
    @GetMapping("/busca/{id}")
    public Usuario getObjectId(@PathVariable("id") int id){
        return service.buscaID(id);
    }

    @GetMapping("/excluir/{id}")
    public String DeleteId(@PathVariable("id") int id){
       
        return service.excluirID(id);

    }
    


}
