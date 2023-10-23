package com.br.apirest.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.apirest.dto.LoginDto;
import com.br.apirest.dto.UsuarioDto;
import com.br.apirest.entities.Usuario;
import com.br.apirest.repository.UsuarioRepository;
import com.br.apirest.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    UsuarioService service;



    @GetMapping("/lista")//listar todos o usuarios dentro do Bd
    public List<UsuarioDto> ListaUsuarios(){
        return service.listaUsuario(); 
    }

    
    @PostMapping("/cadastro") // receber informações do cadastro de usuarios
    public String cadastro(Usuario usuario){
        return service.salvar(usuario);
    }


    
    @GetMapping("/busca/{id}")
    public UsuarioDto getObjectId(@PathVariable("id") int id){
        return service.buscaID(id);
    }

    @GetMapping("/excluir/{id}")
    public String DeleteId(@PathVariable("id") int id){
       
        return service.excluirID(id);

    }

    @PostMapping("/login")
    public ResponseEntity<String> login(LoginDto usuarioLoginDto) {
        return service.autenticar(usuarioLoginDto);
    }
    


}
