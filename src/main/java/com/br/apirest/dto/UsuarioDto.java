package com.br.apirest.dto;

import com.br.apirest.entities.Usuario;

public class UsuarioDto {

     private int id;
    private String nome;
    private String username;
    private String email;


public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.username = usuario.getUsername();
        this.email = usuario.getEmail();
    }


     public UsuarioDto(){
        
    }


    public UsuarioDto(int id, String nome, String username, String email) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.email = email;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


   
    
}
