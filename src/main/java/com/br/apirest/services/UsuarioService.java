package com.br.apirest.services;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.br.apirest.dto.LoginDto;
import com.br.apirest.dto.UsuarioDto;
import com.br.apirest.entities.Usuario;
import com.br.apirest.repository.UsuarioRepository;

@Service //porq e uma classe de servico
public class UsuarioService {
    
    @Autowired
    UsuarioRepository repository;

    private PasswordEncoder passwordEncoder;

    //LISTAR
    public List<UsuarioDto> listaUsuario(){
    List<Usuario> usuarios = new ArrayList<>();
    usuarios = repository.findAll();
    return usuarios.stream().map(x -> new UsuarioDto(x)).collect(Collectors.toList());
        
    }

    public String salvar(Usuario usuario){
        repository.save(usuario);
        return "";
    }

    public UsuarioDto buscaID(int id){

        Usuario usuario = new Usuario();
        usuario = repository.findById(id);
        UsuarioDto dto = new UsuarioDto(usuario);
        return dto;
    }

    public String excluirID(int id){
       
        repository.deleteById(id);
        return "";
    }

       
    
  public ResponseEntity<String> autenticar(LoginDto usuarioLoginDto) {
        ResponseEntity<String> resposta = new ResponseEntity<>(HttpStatus.ACCEPTED);
        List<Usuario> usuarios = repository.findAll();
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(usuarioLoginDto.getLogin()) &&
                    passwordEncoder.matches(usuarioLoginDto.getSenha(), usuario.getSenha())) {
                resposta = ResponseEntity.ok("Autenticado com sucesso!");
                break;
            } else {
                resposta = ResponseEntity.badRequest().body("Login Inválido");
            }
        }

        return resposta;

    }
    

    
}
